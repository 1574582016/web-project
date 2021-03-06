package com.sky.learn.api.controller;



import com.sky.learn.api.AbstractController;
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

    @PostMapping("/getSelectOption")
    public Object getSystemMenuList(String indetity){
        return ResponseEntity.ok(MapSuccess("查询成功" , postJsonObjectData(selectOption + indetity ,null)));
    }
}
