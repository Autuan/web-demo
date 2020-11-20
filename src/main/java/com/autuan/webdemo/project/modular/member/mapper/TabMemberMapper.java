package com.autuan.webdemo.project.modular.member.mapper;

import com.autuan.webdemo.project.modular.member.entity.TabMember;
import com.autuan.webdemo.project.modular.member.entity.TabMemberExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TabMemberMapper {
    long countByExample(TabMemberExample example);

    int deleteByExample(TabMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TabMember record);

    int insertSelective(@Param("record") TabMember record, @Param("selective") TabMember.Column ... selective);

    TabMember selectOneByExample(TabMemberExample example);

    List<TabMember> selectByExample(TabMemberExample example);

    TabMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TabMember record, @Param("example") TabMemberExample example, @Param("selective") TabMember.Column ... selective);

    int updateByExample(@Param("record") TabMember record, @Param("example") TabMemberExample example);

    int updateByPrimaryKeySelective(@Param("record") TabMember record, @Param("selective") TabMember.Column ... selective);

    int updateByPrimaryKey(TabMember record);

    int batchInsert(@Param("list") List<TabMember> list);

    int batchInsertSelective(@Param("list") List<TabMember> list, @Param("selective") TabMember.Column ... selective);
}