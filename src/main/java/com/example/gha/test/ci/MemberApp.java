package com.example.gha.test.ci;

import com.example.gha.test.ci.member.Grade;
import com.example.gha.test.ci.member.Member;
import com.example.gha.test.ci.member.MemberService;
import com.example.gha.test.ci.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        System.out.println("hello!");
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
