package com.example.usermanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usermanagementapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByPhoneNumber(Long phoneNumber);
    User findByEmailId(String emailId);
}
