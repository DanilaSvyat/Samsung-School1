package com.samsung.model;

public abstract class User implements Printer{
    protected String name;
    protected String sureName;
    protected String fathersName;
    protected String phoneNumber;
    public abstract void sayHello();

    public User(String name, String sureName, String fathersName, String phoneNumber) {
        this.name = name;
        this.sureName = sureName;
        this.fathersName = fathersName;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public User(String name, String sureName, String fathersName) {
        this.name = name;
        this.sureName = sureName;
        this.fathersName = fathersName;
    }

    public String getName() {
        return name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSureName() {
        return sureName;
    }
}
