package com.example.demo.controller;


import com.example.demo.member.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/save")
    public Member createMember(@RequestParam("id") String id, @RequestParam("passwd") String passwd, @RequestParam("name") String name)
    {
        Member member = new Member(id, passwd, name);
        return memberService.createUser(member);
    }

    @GetMapping(value = "/findall")
    public List<Member> getAllMembers()
    {
        return memberService.getAllMembers();
    }

    @GetMapping("/find/{id}")
    public Member getMemberById(@PathVariable String id)
    {
        return memberService.getMemberById(id);
    }
    @DeleteMapping("{id}")
    public void deleteMemberById(@PathVariable String id)
    {
        memberService.deleteMemberById(id);
    }



}
