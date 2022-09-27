package com.example.gha.test.ci.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
