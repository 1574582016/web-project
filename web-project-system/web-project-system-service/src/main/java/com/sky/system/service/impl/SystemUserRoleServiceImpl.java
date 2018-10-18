package com.sky.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.system.mapper.SystemUserRoleMapper;
import com.sky.system.model.SystemUserRole;
import com.sky.system.service.SystemUserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ThinkPad on 2018/10/12.
 */
@Service
@Transactional
public class SystemUserRoleServiceImpl extends ServiceImpl<SystemUserRoleMapper,SystemUserRole> implements SystemUserRoleService {
}
