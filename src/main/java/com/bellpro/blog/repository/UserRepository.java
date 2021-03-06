package com.bellpro.blog.repository;

import com.bellpro.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository 상속 받아서 사용 <엔티티, ID 자료형>
// 공통 인터페이스 사용 가능 (save, delete, findById ...)
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username); // Validator 닉네임 중복 여부
    boolean existsByEmail(String email);       // Validator 이메일 중복 여부

    // Optional 은 NULL 값을 감싸는 Wrapper 클래스로, 참조하더라도 NPE 가 발생하지 않도록 도와줌
    Optional<User> findByUsername(String username); // 닉네임 (메소드 이름으로 쿼리 생성)
    Optional<User> findByEmail(String email); // 이메일 (메소드 이름으로 쿼리 생성)
    Optional<User> findByKakaoId(String kakaoId); // 카카오 ID (메소드 이름으로 쿼리 생성)
}
