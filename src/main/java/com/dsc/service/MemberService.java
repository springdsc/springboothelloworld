package com.dsc.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname MemberService
 * @Description TODO
 * @Date 2021/1/24 22:26
 * @Created by 撒破云
 */
@RestController
public class MemberService {

    @RequestMapping("/getMember")
    public String getUser(){
        return "member";
    }
}
