package com.example.demo.service;

import com.example.demo.member.Member;

import java.util.List;

public interface MemberService {

    Member createUser(Member member);
    List<Member> getAllMembers();
    Member getMemberById(String id);
    void deleteMemberById(String id);


}
