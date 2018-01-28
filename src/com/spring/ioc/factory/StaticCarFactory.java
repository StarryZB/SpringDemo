package com.spring.ioc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by StarryZB on 2018/1/26.
 */

//静态工厂方法配置bean
public class StaticCarFactory {

    private static Map<String,Car> cars = new HashMap<String,Car>();

    static {
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",400000));
    }

    public static Car getCar(String name) {
        return cars.get(name);
    }
}
