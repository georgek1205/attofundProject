package com.example.demo.service;

import com.example.demo.member.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member createUser(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMembers() {

        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(String id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMemberById(String id) {
        memberRepository.deleteById(id);
    }
}

