package com.sky.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.system.mapper.SystemRoleMenuMapper;
import com.sky.system.model.SystemRoleMenu;
import com.sky.system.service.SystemRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/10.
 */
@Service
@Transactional
public class SystemRoleMenuServiceImpl extends ServiceImpl<SystemRoleMenuMapper,SystemRoleMenu> implements SystemRoleMenuService {
}
