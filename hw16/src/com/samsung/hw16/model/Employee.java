package com.samsung.hw16.model;

public class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public String toString() {
        return "(" + super.getName() + ", " + super.getAge() + ", " + company + ")";
    }
    @Override
    public String work(){
        return "Manager";
    }
}
