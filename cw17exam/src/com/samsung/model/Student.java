package com.samsung.model;

public class Student extends User {
    private String group;

    public Student(String name, String sureName, String fathersName, String phoneNumber, String group) {
        super(name, sureName, fathersName, phoneNumber);
        this.group = group;
    }

    public Student(String name, String sureName, String fathersName, String group) {
        super(name, sureName, fathersName);
        this.group = group;
    }

    public Student(Student student) {
        this.name = student.name;
        this.sureName = student.sureName;
        this.fathersName = student.fathersName;
        this.phoneNumber = student.phoneNumber;
        this.group = student.group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public String printInfoToConsole() {
        return (this.getSureName() + " " + this.name + " " + this.fathersName +
                ", учится в группе " + this.group);
    }


    public void sayHello() {
        System.out.println("Привет! Я студент, моё имя " + this.getName() + " " + this.getSureName());
    }

}
