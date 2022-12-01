package com.samsung.model;

import java.util.Arrays;

public class University implements Printer {
    private final String address = "Москва, Улица ленина.";

    private Student[] studentsList;
    private Teacher[] teachersList;

    public University(Student[] studentsList, Teacher[] teachersList) {
        this.studentsList = studentsList;
        this.teachersList = teachersList;
    }

    @Override
    public String printInfoToConsole() {
        return (this).toString();
    }

    @Override
    public String toString() {
        return "Адресс университета:" + this.address + "\n" +
                "Список учителей: " + Arrays.toString(this.teachersList) + "\n" +
                "Список учеников: " + Arrays.toString(this.studentsList);
    }


}
