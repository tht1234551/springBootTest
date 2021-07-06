package com.example.demo2;

import com.example.demo2.dao.MemberRepository;
import com.example.demo2.dao.MemberRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class SpringConfig {

    @PersistenceContext
    private EntityManager em;

    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepositoryImpl();
    }
}
