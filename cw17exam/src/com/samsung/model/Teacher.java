package com.samsung.model;

public class Teacher extends User {
    private String theme;

    public Teacher(String name, String sureName, String fathersName, String phoneNumber, String theme) {
        super(name, sureName, fathersName, phoneNumber);
        this.theme = theme;
    }

    public Teacher(String name, String sureName, String fathersName, String theme) {
        super(name, sureName, fathersName);
        this.theme = theme;
    }

    public Teacher(Teacher teacher) {
        this.name = teacher.name;
        this.sureName = teacher.sureName;
        this.fathersName = teacher.fathersName;
        this.phoneNumber = teacher.phoneNumber;
        this.theme = teacher.theme;
    }

    public String getTheme() {
        return theme;
    }

    public void sayHello() {
        System.out.println("Привет! Я преподаватель, моё имя " + this.getName() + " " + this.getSureName() + " " + this.getFathersName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "theme='" + theme + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public String printInfoToConsole() {
        return (this.getSureName() + " " + this.name + " " + this.fathersName +
                ", преподаёт " + this.theme);
    }

}

