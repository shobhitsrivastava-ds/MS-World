package com.msworld.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msworld.userService.entity.UserDetail;

@Repository
public interface UserRepository  extends JpaRepository<UserDetail,Long> {
    UserDetail findByUserId(Long userId);
}