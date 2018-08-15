package com.example.apitest.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
    @RequestMapping("/test1")
    public String test1(String name) {
        return "Hi, test api get value is: " + name;
    }

    @RequestMapping("/test2")
    public JSONObject test2() {
        JSONObject json = new JSONObject();
        json.put("name", "fitz");
        json.put("age", 33);
        json.put("gender", true);
        json.put("result", "ok");
        return json;
    }

}
