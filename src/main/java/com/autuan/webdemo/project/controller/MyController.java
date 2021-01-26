package com.autuan.webdemo.project.controller;

import com.autuan.webdemo.project.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/hi")
    public String hi(){
        myService.configBeanUse();
        return "hello autuan";
    }

    @RequestMapping("/send")
    public Object send(){
        return "send";
    }
}
