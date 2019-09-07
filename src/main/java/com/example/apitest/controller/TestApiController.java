package com.example.apitest.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {

    private static Logger logger = LoggerFactory.getLogger(TestApiController.class);

    @RequestMapping("/test1")
    public String test1(String name) {
        logger.info("hixxxxxxxx " + name);
        return "Hi, update1, test api get value is: " + name;
    }

    @RequestMapping("/test2")
    public JSONObject test2() {
        JSONObject json = new JSONObject();
        json.put("name", "fitz_updated");
        json.put("age", 33);
        json.put("gender", true);
        logger.info("test2 called xxxx");
        return json;
    }

}
