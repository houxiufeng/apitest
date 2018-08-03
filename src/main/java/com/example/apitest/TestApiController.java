package com.example.apitest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
    @RequestMapping("/test1")
    public String test1(String name) {
        return "test api get value: " + name;
    }
}
