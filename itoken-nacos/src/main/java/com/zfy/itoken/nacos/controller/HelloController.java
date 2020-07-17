package com.zfy.itoken.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @GetMapping("/test")
    public String test(){
        System.out.println(datasourceUrl);
        return datasourceUrl;
    }


}
