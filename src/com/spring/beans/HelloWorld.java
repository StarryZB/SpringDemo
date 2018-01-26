package com.spring.beans;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }


}
