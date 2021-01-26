package com.dsc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloWorldService
 * @Description TODO
 * @Date 2021/1/24 20:30
 * @Created by 撒破云
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldService {

    @RequestMapping("/getUser")
    public String getUser(){
        return "dsc";
    }

    public static void main(String[] args) {
        String aa = "";
        String dd = "";
        SpringApplication.run(HelloWorldService.class,args);
    }
}
