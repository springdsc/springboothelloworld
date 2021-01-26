package com.dsc.controller;

import com.dsc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Classname FreemarkerController
 * @Description TODO
 * @Date 2021/1/26 20:29
 * @Created by 撒破云
 */
@Controller
public class FreemarkerController {
    @RequestMapping("/demo")
    public String demo(Map<String, Object> map) {
        map.put("descrip", "It's a springboot integrate freemarker's demo!!!!");
        return "demo";
    }


    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("user",new User("dsc",12));
        return "index";
    }
}
