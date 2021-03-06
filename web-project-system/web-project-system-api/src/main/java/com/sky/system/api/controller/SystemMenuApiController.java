package com.sky.system.api.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.sky.system.api.AbstractController;
import com.sky.system.model.SystemMenu;
import com.sky.system.model.SystemRole;
import com.sky.system.model.SystemRoleMenu;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ThinkPad on 2018/10/6.
 */
@RestController
@RequestMapping("/api/menu")
public class SystemMenuApiController extends AbstractController {

    @PostMapping("/getMenuTree")
    public Object getMenuTree(){
        return ResponseEntity.ok(MapSuccess("查询成功！",systemMenuService.getMenuTree()));
    }

    @PostMapping("/getMenuList")
    public Object getMenuList(){
        return ResponseEntity.ok(MapSuccess("查询成功！",systemMenuService.getMenuList()));
    }

    @PostMapping("/getMenuInfo")
    public Object getMenuInfo(String menuCode){
        SystemMenu systemMenu = systemMenuService.selectOne(new EntityWrapper<SystemMenu>().where("menu_code = {0}",menuCode));
        List<SystemRole> list = systemRoleService.getSystemRoleList(null ,menuCode);
        Map<String ,Object> map = new HashMap<String ,Object>();
        map.put("result" , systemMenu);
        map.put("role" ,list );
        return ResponseEntity.ok(MapSuccess("查询成功！",map));
    }

    @PostMapping("/checkMenuName")
    public Object checkMenuName(String parentCode , String menuName ,String menuCode){
        SystemMenu systemMenu = systemMenuService.selectOne(new EntityWrapper<SystemMenu>().where("menu_name = {0}",menuName).and("parent_code = {0}",parentCode));
        if(StringUtils.isNotBlank(menuCode)){
            systemMenu = null;
        }
        return ResponseEntity.ok(MapSuccess("查询成功！",systemMenu != null ? true : false));
    }

    @PostMapping("/editMenu")
    public Object editMenu(@RequestBody SystemMenu body ,String roleId){
        String[] roleIds = {};
        if(StringUtils.isNotBlank(roleId)){
            roleIds = roleId.split(",");
        }
        if(StringUtils.isNotBlank(body.getMenuCode())){
            systemMenuService.update(body , new EntityWrapper<SystemMenu>().where("menu_code = {0}", body.getMenuCode()));
            saveRoleMenuList(roleIds , body.getMenuCode());
        }else{
            body.setMenuCode(IdWorker.getIdStr());
            systemMenuService.insert(body);
            SystemMenu systemMenu = systemMenuService.selectOne(new EntityWrapper<SystemMenu>().where("menu_name = {0}",body.getMenuName()).and("parent_code = {0}",body.getParentCode()));
            saveRoleMenuList(roleIds , systemMenu.getMenuCode());
        }

        return ResponseEntity.ok(MapSuccess("保存成功！", body.getMenuCode()));
    }

    private boolean saveRoleMenuList(String[] roleId , String menuCode){
        systemRoleMenuService.delete(new EntityWrapper<SystemRoleMenu>().where("menu_code = {0}", menuCode));
        List<SystemRoleMenu> list = new ArrayList<SystemRoleMenu>();
        for(String id : roleId){
            SystemRoleMenu systemRoleMenu = new SystemRoleMenu();
            systemRoleMenu.setMenuCode(menuCode);
            systemRoleMenu.setRoleCode(id);
            list.add(systemRoleMenu);
        }
        boolean addJust = false;
        if(list.size()>0){
            addJust = systemRoleMenuService.insertBatch(list);
        }
        return addJust;
    }
}
