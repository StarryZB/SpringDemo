package com.spring.ioc.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Repository
public class UserJdbcRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save...");
    }
}
