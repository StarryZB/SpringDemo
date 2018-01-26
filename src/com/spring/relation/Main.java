package com.spring.relation;

import com.spring.autowire.Address;
import com.spring.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-relation.xml");
//        Address address = (Address) applicationContext.getBean("address");
//        System.out.println(address);
        Address address2 = (Address) applicationContext.getBean("address2");
        System.out.println(address2);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }


}
