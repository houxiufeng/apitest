package com.example.apitest;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
    @RequestMapping("/test1")
    public String test1(String name) {
        return "test api get value: " + name;
    }

    @RequestMapping("/test2")
    public JSONObject test2() {
        JSONObject json = new JSONObject();
        json.put("name", "fitz");
        json.put("age", 30);
        json.put("gender", true);
        return json;
    }

}
