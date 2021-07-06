package com.example.demo2.dao;

import com.example.demo2.domain.Member;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MemberRepositoryImpl implements MemberRepository{

    @Setter(onMethod_ = @Autowired)
    private EntityManager em;

    @Override
    public int create(Member member) {
        em.persist(member);
        return 0;
    }

    @Override
    public Member read(Member member) {
        return null;
    }

    @Override
    public int update(Member member) {
        return 0;
    }

    @Override
    public int delete(Member member) {
        return 0;
    }

    @Override
    public List<Member> readAll() {
        return null;
    }
}
