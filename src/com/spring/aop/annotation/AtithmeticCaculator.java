package com.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by StarryZB on 2018/1/28.
 */

@Component
public interface AtithmeticCaculator {
    int add(int i, int j);
    int sub(int i, int j);
    int mul(int i, int j);
    int div(int i, int j);
}
