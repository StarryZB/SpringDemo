package com.spring.factorybean;

import com.spring.autowire.Address;
import com.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-beanfactory.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }

}
