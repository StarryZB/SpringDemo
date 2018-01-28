package com.spring.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by StarryZB on 2018/1/26.
 */

//实例工厂方法配置bean
public class InstanceCarFactory {

    private Map<String,Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }
}
