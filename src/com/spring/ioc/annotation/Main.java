package com.spring.ioc.annotation;

import com.spring.ioc.annotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/28.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject testObject = (TestObject) applicationContext.getBean("testObject");
//        System.out.println(testObject);
        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);
        userController.execute();
//        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRespository");
//        System.out.println(userRepository);
//        UserService userService= (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);
    }
}
