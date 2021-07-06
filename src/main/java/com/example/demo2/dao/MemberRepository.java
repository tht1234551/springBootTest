package com.example.demo2.dao;

import com.example.demo2.domain.Member;

import java.util.List;

public interface MemberRepository {

    int create(Member member);

    Member read(Member member);

    int update(Member member);

    int delete(Member member);

    List<Member> readAll();

}
