package com.spring.annotation.controller;

import com.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }
}
