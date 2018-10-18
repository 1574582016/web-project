package com.sky.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sky.system.mapper.SystemUserMapper;
import com.sky.system.model.SystemUser;
import com.sky.system.service.SystemUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ThinkPad on 2018/10/12.
 */
@Service
@Transactional
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper,SystemUser> implements SystemUserService {
    @Override
    public Page<SystemUser> getSystemUserList(Integer page, Integer size, String userName, String roleName, String roleCode) {
        Page<SystemUser> pageInfo = new Page<SystemUser>(page, size);
        List<SystemUser> list = baseMapper.getSystemUserList(pageInfo,userName, roleName, roleCode);
        pageInfo.setRecords(list);
        return pageInfo;
    }

    @Override
    public List<SystemUser> getSystemUserList(String userName, String roleName, String roleCode) {
        return baseMapper.getSystemUserList(userName, roleName, roleCode);
    }
}
