package com.sky.system.api;

import com.sky.core.controller.BaseController;
import com.sky.system.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


/**
 * Created by ThinkPad on 2018/10/13.
 */
public class AbstractController extends BaseController {

    @Value("${system.files.diary-text-path}")
    protected  String diaryTextPath;

    @Autowired
    protected SystemMenuService systemMenuService ;

    @Autowired
    protected SystemRoleMenuService systemRoleMenuService ;

    @Autowired
    protected SystemRoleService systemRoleService ;

    @Autowired
    protected SystemUserService systemUserService ;

    @Autowired
    protected SystemUserRoleService systemUserRoleService ;

    @Autowired
    protected SystemParamService systemParamService ;

}
