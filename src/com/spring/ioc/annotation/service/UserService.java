package com.spring.ioc.annotation.service;

import com.spring.ioc.annotation.repository.UserRepository;
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
        this.userRepository = userRepository;
    }
    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
    }
}
