package com.spring.beans;

/**
 * Created by StarryZB on 2018/1/25.
 */
public class Car {
    private String brand;
    private String corp;
    private double price;
    private int maxspeed;

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxspeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxspeed = maxspeed;
    }

    public Car(String brand, String corp, double price, int maxspeed) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
        this.maxspeed = maxspeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxspeed=" + maxspeed +
                '}';
    }
}
