package com.spring.factory;

import com.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car1);
        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);

    }


}
