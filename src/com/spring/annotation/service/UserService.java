package com.spring.annotation.service;

import com.spring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public  void setUserRepository(UserRepository userRepository) {

    }
    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
