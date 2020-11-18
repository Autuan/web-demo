package com.autuan.webdemo.project.service.impl;

import com.autuan.webdemo.project.entity.CustomServiceDO;
import com.autuan.webdemo.project.entity.DemoDTO;
import com.autuan.webdemo.project.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @description: MyServiceImpl
 * @author: Autuan.Yu
 * @create: 2020/10/09 19:45
 * @copyright: Toplist
 */
@Service
@Slf4j
public class MyServiceImpl implements MyService {
    @Autowired
    private CustomServiceDO customServiceDO;

    @Override
    public void configBeanUse() {
        log.info("address -> {}",customServiceDO.getAddress());
    }
}
