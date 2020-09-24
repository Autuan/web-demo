package com.autuan.webdemo.project.controller;

import com.autuan.webdemo.project.aop.Log;
import com.autuan.webdemo.project.ennum.BusinessType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Autuan.Yu
 * @description :  描述
 * @remark : 备注
 * @date : 2020/9/24 21:33
 * @company : 上海奥若拉信息科技集团有限公司
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
}
