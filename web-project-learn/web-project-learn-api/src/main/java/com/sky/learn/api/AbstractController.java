package com.sky.learn.api;

import com.sky.core.controller.BaseController;
import com.sky.learn.service.LearnDiaryService;
import com.sky.learn.service.LearnEnglishWordService;
import com.sky.learn.service.LearnQuestionService;
import com.sky.learn.service.LearnTaskService;
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

    @Value("${api.system.selectOption}")
    protected  String selectOption;

    @Value("${system.files.diary-text-path}")
    protected  String diaryTextPath;

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
    protected LearnEnglishWordService learnEnglishWordService ;

    @Autowired
    protected LearnDiaryService learnDiaryService;

    @Autowired
    protected LearnTaskService learnTaskService ;

    @Autowired
    protected LearnQuestionService learnQuestionService ;

}
