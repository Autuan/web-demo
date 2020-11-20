package com.autuan.webdemo.project.service.impl;

import com.autuan.webdemo.project.event.EventPublishComponent;
import com.autuan.webdemo.project.event.OneThingEvent;
import com.autuan.webdemo.project.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventPublishComponent eventPublishComponent;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

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

    @Override
    public void sendRedisEvent() {
        log.info("向REDIS中放入值 -> string类型");
        redisTemplate.opsForValue().set("redisEvent","redisEventVal",5000L, TimeUnit.SECONDS);
    }
}
