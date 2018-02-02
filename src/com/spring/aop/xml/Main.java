package com.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by StarryZB on 2018/2/1.
 */


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-applicationcontextxml.xml");
        AtithmeticCaculator atithmeticCaculator = applicationContext.getBean(AtithmeticCaculator.class);
        int result = atithmeticCaculator.add(3,6);
        System.out.println("result:" + result);
        result = atithmeticCaculator.sub(3,6);
        System.out.println("result:" + result);

    }
}
