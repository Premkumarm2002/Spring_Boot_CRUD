package com.example.usermanagementapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagementapp.entity.User;
import com.example.usermanagementapp.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }
}

