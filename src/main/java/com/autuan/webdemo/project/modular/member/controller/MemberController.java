package com.autuan.webdemo.project.modular.member.controller;

import com.autuan.webdemo.project.modular.member.entity.TabMember;
import com.autuan.webdemo.project.modular.member.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {
    @Autowired
    private IMemberService memberService;

    @PostMapping("/modular/member/add")
    String add(@RequestBody TabMember member){
        memberService.add(member);
        return "success";
    }

    @PatchMapping
    String update(@RequestBody TabMember member) {
        memberService.update(member);
        return "success";
    }
}
