package com.spring.ioc.beans;

import java.util.List;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Person {
    private String name;
    private int age;
    private Car car;
    private List cars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List getCars() {
        return cars;
    }

    public void setCars(List cars) {
        this.cars = cars;
    }

    public Person() {
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", cars=" + cars +
                '}';
    }
}
