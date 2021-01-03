package com.autuan.webdemo.project.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IdController {
    @RequestMapping("/snowflake/id")
    @ResponseBody
    public Object generatorId(){
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();

        return id;
    }
}
