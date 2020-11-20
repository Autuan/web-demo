package com.autuan.webdemo.project.modular.member.service.impl;

import com.autuan.webdemo.project.modular.member.entity.TabMember;
import com.autuan.webdemo.project.modular.member.mapper.TabMemberMapper;
import com.autuan.webdemo.project.modular.member.service.IMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class MemberServiceImpl implements IMemberService {
    @Resource
    private TabMemberMapper memberMapper;
    @Override
    public void add(TabMember member) {
        log.info("member ->　add -> ");
        memberMapper.insertSelective(member);
    }

    @Override
    public void update(TabMember member) {
        log.info("member -> update");
        memberMapper.updateByPrimaryKeySelective(member);
    }
}
