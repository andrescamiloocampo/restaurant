package com.example.restaurant.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    private String id;
    private String name;
    private String password;
    private boolean isActive;
    
    User(){}

    public User(String id, String name, String password, boolean isActive) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
