package com.autuan.webdemo.project.controller;


import com.autuan.webdemo.project.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping("/doOneThing")
    @ResponseBody
    public String doOneThing(){
        return eventService.oneThing();
    }

    @RequestMapping("/sendRedisEvent")
    @ResponseBody
    public Object sendRedisEvent(){
        eventService.sendRedisEvent();
        return "success";
    }
}
