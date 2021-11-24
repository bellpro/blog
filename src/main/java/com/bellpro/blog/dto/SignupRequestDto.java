package com.bellpro.blog.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter // set 메소드 일괄 생성
@Getter // get 메소드 일괄 생성
public class SignupRequestDto {

    @NotBlank           // NULL, "", " " 불가
    @Length(min = 3)    //  최소 3자 이상
    @Pattern(regexp = "^[a-zA-Z0-9]{3,}$")   // 알파벳 대소문자(a~z, A~Z), 숫자(0~9)
    private String username;

    @NotBlank           // NULL, "", " " 불가
    @Length(min = 4)    // 최소 4자 이상
    private String password;

    @NotBlank           // NULL, "", " " 불가
    @Length(min = 4)    // 최소 4자 이상
    private String passwordConfirm;

    @NotBlank           // NULL, "", " " 불가
    @Email              // 이메일 형식
    private String email;
}
