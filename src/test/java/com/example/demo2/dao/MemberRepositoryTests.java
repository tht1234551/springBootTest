package com.example.demo2.dao;

import com.example.demo2.domain.Member;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.util.Assert;

import javax.transaction.Transactional;

import static org.springframework.util.Assert.isTrue;

@SpringBootTest
@Log4j
@Transactional
public class MemberRepositoryTests {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void getRepository(){
        isTrue(memberRepository != null, "메시지?");
        System.out.println(memberRepository);
    }

    @Test
    @Commit
    public void insert(){
        int random = (int)(Math.random() * 10000) + 1;
        Member member = new Member();
        member.setName("정형진" + random);
        member.setPassword(random + "");
        member.setUsername("asd123" + random);
        memberRepository.create(member);
    }
}
