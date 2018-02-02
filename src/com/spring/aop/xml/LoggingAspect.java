package com.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.List;

/**
 * Created by StarryZB on 2018/2/1.
 */
public class LoggingAspect {

    public void declareJointPointExpression() {}

    public void beforeMethod(JoinPoint joinPoint) {
        String mtehodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + mtehodName + " begins with " + args);
    }

    public void afterMethod(JoinPoint joinPoint) {
        String mtehodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + mtehodName + " ends with " + args);
    }
}
