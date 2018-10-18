package com.sky.economy.api.controller;


import com.sky.economy.api.AbstractController;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ThinkPad on 2018/10/17.
 */
@RestController
@RequestMapping("/api/index")
public class IndexApiController extends AbstractController {

    @PostMapping("/getSystemMenuList")
    public Object getSystemMenuList(){
        return ResponseEntity.ok(MapSuccess("查询成功" , postJsonObjectData(apiSystemMenuList,null)));
    }
}
