package com.spring.ioc.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
