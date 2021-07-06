package com.example.demo2.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Member {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    private String name;
    private String password;

    @Column(name = "mappingTest")
    private String mappingColumn;
}
