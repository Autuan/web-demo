package com.autuan.webdemo.project.event;

import org.springframework.context.ApplicationEvent;

public class OneThingEvent extends ApplicationEvent {
    public OneThingEvent(Object source) {
        super(source);
    }
}
