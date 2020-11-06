package com.autuan.webdemo.project.listen;

import com.autuan.webdemo.project.event.OneThingEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EventListen implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == OneThingEvent.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("event 观察者 事件执行");
    }
}
