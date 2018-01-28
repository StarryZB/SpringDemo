package com.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by StarryZB on 2018/1/28.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    @Override
    public Car getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
