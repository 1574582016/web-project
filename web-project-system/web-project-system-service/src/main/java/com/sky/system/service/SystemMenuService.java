package com.sky.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.sky.system.model.SystemMenu;
import com.sky.system.model.SystemRoleMenu;
import com.sky.system.vo.SystemMenu_VO;
import com.sky.system.vo.TreeNode;

import java.util.List;


/**
 * Created by ThinkPad on 2018/10/6.
 */
public interface SystemMenuService extends IService<SystemMenu> {

    List<TreeNode> getMenuTree();

    List<SystemMenu_VO> getMenuList();

}
