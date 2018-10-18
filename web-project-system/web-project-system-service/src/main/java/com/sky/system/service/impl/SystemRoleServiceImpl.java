package com.sky.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.system.mapper.SystemRoleMapper;
import com.sky.system.model.SystemRole;
import com.sky.system.service.SystemRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ThinkPad on 2018/10/9.
 */
@Service
@Transactional
public class SystemRoleServiceImpl extends ServiceImpl<SystemRoleMapper,SystemRole> implements SystemRoleService {
    @Override
    public List<SystemRole> getSystemRoleList(String userCode ,String menuCode) {
        return baseMapper.getSystemRoleList(userCode ,menuCode);
    }
}
