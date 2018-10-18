package com.sky.economy.api;

import com.sky.core.controller.BaseController;
import com.sky.economy.service.EconomyMarketService;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by ThinkPad on 2018/10/16.
 */
public class AbstractController extends BaseController {

    @Value("${api.system.menuList}")
    protected  String apiSystemMenuList;

    @Autowired
    protected RestTemplate restTemplate;

    public Object postJsonObjectData(String url , Map<String ,Object> map){
        String result = restTemplate.postForEntity(url , map,String.class).getBody();
        XMLSerializer xmlSerializer = new XMLSerializer();
        String resutStr = xmlSerializer.read(result).toString();
        JSONObject jsonObject = JSONObject.fromObject(resutStr);
        return jsonObject.get("data");
    }

    @Autowired
    protected EconomyMarketService economyMarketService;

}
