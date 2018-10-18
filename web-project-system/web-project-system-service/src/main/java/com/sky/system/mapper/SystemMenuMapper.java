package com.sky.system.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sky.system.model.SystemMenu;
import com.sky.system.vo.SystemMenu_VO;
import com.sky.system.vo.TreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ThinkPad on 2018/10/6.
 */
public interface SystemMenuMapper extends BaseMapper<SystemMenu> {

    List<SystemMenu_VO> getMenuList();
}
