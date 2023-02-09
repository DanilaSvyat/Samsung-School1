package com.samsung.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    private long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && phoneNumber == person.phoneNumber && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public int compareTo(Person person) {

        if (this.getPhoneNumber() % 100 < person.getPhoneNumber() % 100) return -1;
        if (this.getPhoneNumber() % 100 > person.getPhoneNumber() % 100) return 1;
        if (this.getPhoneNumber() % 100 == person.getPhoneNumber() % 100) {
            if (this.getAge() < person.getAge()) return -1;
            if (this.getAge() > person.getAge()) return 1;
            if (this.getAge() == person.getAge()) {
                return this.getName().compareTo(person.getName());
            }
        }
        return 0;
    }
}
