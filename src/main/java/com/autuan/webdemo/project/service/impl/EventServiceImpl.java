package com.autuan.webdemo.project.service.impl;

import com.autuan.webdemo.project.event.EventPublishComponent;
import com.autuan.webdemo.project.event.OneThingEvent;
import com.autuan.webdemo.project.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventPublishComponent eventPublishComponent;

    @Override
    public String oneThing() {
        log.info("one thing 执行 -> 提交事件");
        eventPublishComponent.publishEvent(new OneThingEvent("source"));
        log.info("one thing return ---------------");
        return "one thing done";
    }

    @Override
    public void otherThing() {

    }
}
