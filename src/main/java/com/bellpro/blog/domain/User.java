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
    private String username;                        // 닉네임

    @Column(nullable = false)                       // 열 설정 (무조건 입력)
    private String password;                        // PW

    @Column(nullable = false, unique = true)        // 열 설정 (무조건 입력, 중복 안됨)
    private String email;                           // 이메일

    @Column(unique = true)                          // 열 설정 (중복 안됨)
    private Long kakaoId;                           // 카카오 ID

    // 생성자 (닉네임, 로그인 Pw, 이메일)
    public User(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // 생성자 (닉네임, 로그인 Pw, 이메일, 카카오 ID)
    public User(String username, String password, String email, Long kakaoId){
        this.username = username;
        this.password = password;
        this.email = email;
        this.kakaoId = kakaoId;

    }
}
