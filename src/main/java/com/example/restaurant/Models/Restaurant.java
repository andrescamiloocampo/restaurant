package com.example.restaurant.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {
    private String NIT;
    private String name;
    private String type;
    private int openTime;
    private boolean delivery;
    private String paymentMethod;
    private boolean vegetarian;

    Restaurant(){}

    public Restaurant(String NIT, String name, String type, int openTime, boolean delivery, String paymentMethod, boolean vegetarian) {
        this.NIT = NIT;
        this.name = name;
        this.type = type;
        this.openTime = openTime;
        this.delivery = delivery;
        this.paymentMethod = paymentMethod;
        this.vegetarian = vegetarian;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
