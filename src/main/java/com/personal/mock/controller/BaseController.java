package com.personal.mock.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * author: zhaoxu
 * date: 2019/2/26 上午10:13
 */
@RestController
public class BaseController {
    @RequestMapping(path ={"/","/index"} ,method = {RequestMethod.GET,RequestMethod.POST})
    public JSONObject index(){
        HashMap<String,Object> index = new HashMap<>();
        index.put("name","mock-gateway");
        return new JSONObject(index);
    }
}
