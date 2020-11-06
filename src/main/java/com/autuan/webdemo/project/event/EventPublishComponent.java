package com.autuan.webdemo.project.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class EventPublishComponent  implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
