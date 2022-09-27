package com.example.gha.test.ci.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
