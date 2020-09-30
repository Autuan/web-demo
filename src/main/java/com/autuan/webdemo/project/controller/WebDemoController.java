package com.autuan.webdemo.project.controller;

import com.autuan.webdemo.project.aop.Log;
import com.autuan.webdemo.project.aop.MyAnnotation;
import com.autuan.webdemo.project.ennum.BusinessType;
import com.autuan.webdemo.project.entity.ReqVO;
import com.autuan.webdemo.project.entity.ResDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Autuan.Yu
 * @description :  描述
 * @remark : 备注
 * @date : 2020/9/24 21:33
 */
@RestController
@RequestMapping("/logAop")
public class WebDemoController {
    @RequestMapping("/create")
    @Log(title = "create 方法 title",businessType =  BusinessType.INSERT)
    public Object create(){
        return "create";
    }

    @RequestMapping("/read")
    @Log(title = "read 方法 title",businessType =  BusinessType.OTHER)
    public Object read(String readId){
        return "read";
    }

    @RequestMapping("/update")
    @MyAnnotation(msg = "this is msg",title = "hello,autuan")
    public Object update() {
        return ResDTO.builder()
                .responseId("hello,Autuan")
                .build();
    }


}
