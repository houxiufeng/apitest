package com.example.apitest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author fitz
 * @date 2018-12-22 13:20
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hi")
    public String sayHi(String name) {
        logger.info("call sayHi");
        return String.format("hi %s, now is %s", name, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
