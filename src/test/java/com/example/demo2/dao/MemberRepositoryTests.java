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

    static final int random = (int)(Math.random() * 10000) + 1;

    @Test
    public void getRepository(){
        isTrue(memberRepository != null, "메시지?");
        System.out.println(memberRepository);
    }

    @Test
    @Commit
    public void insert(){
        Member member = new Member();
        member.setName("정형진" + random);
        member.setPassword(random + "");
        member.setUsername("asd123" + random);
        memberRepository.create(member);
    }

    @Test
    public void select(){
        Member readId = new Member();
        readId.setUsername("asd123" + random);
        Member member = memberRepository.read(readId);
        isTrue(member != null, "유저 가져오기");
        System.out.println(member);
    }
}
