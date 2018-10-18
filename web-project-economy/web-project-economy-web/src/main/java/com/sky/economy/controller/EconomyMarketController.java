package com.sky.economy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ThinkPad on 2018/10/17.
 */
@Controller
@RequestMapping("/economy")
public class EconomyMarketController {

    @RequestMapping("/economyMarketList")
    public String economyMarketList(){
        return "page/economyMarketList";
    }
}
