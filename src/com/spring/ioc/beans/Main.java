package com.spring.ioc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.hello();
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        Car car2 = (Car) applicationContext.getBean("car2");
        System.out.println(car2);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);
        DataSource dataSource = (DataSource) applicationContext.getBean("datasource");
        System.out.println(dataSource.getProperties());
        Person person4 = (Person) applicationContext.getBean("person4");
        System.out.println(person4);
        Person person5 = (Person) applicationContext.getBean("person5");
        System.out.println(person5);
    }
}
