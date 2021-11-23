package com.bellpro.blog.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter // set 메소드 일괄 생성
@Getter // get 메소드 일괄 생성
@NoArgsConstructor  // 기본 생성자 만듦
@Entity // DB 테이블 역할
public class User {

    @Id // ID 기본키(PK) 설정
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가
    private Long id;                                // 기본키 ID

    @Column(nullable = false, unique = true)        // 열 설정 (무조건 입력, 중복 안됨)
    private String username;                        // 로그인 ID

    @Column(nullable = false)                       // 열 설정 (무조건 입력)
    private String password;                        // 로그인 PW

    @Column(nullable = false, unique = true)        // 열 설정 (무조건 입력, 중복 안됨)
    private String email;                           // 이메일

    // 생성자
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
