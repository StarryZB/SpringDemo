package com.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by StarryZB on 2018/2/1.
 */

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.spring.aop.annotation.*.*(int, int))")
    public void declareJointPointExpression() {}

    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
        String mtehodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + mtehodName + " begins with " + args);
    }

    @After("execution(* com.spring.aop.annotation.*.*(int, int))")
    public void afterMethod(JoinPoint joinPoint) {
        String mtehodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + mtehodName + " ends with " + args);
    }
}
