package com.samsung.model;

import java.util.Arrays;

public class University implements Printer {
    private final String address = "Москва, Улица ленина.";
    static int i;
    private String[] studentsList;
    private String[] teachersList;



    public University(Student student,Student student1,Teacher teacher1) {
        studentsList = new String[2];
        teachersList = new String[1];

            studentsList[0] = student.printInfoToConsole();
            studentsList[1] = student1.printInfoToConsole();
            teachersList[0] = teacher1.printInfoToConsole();
    }

    public University(Teacher teacher) {
        studentsList = new String[1000];
        while (i < 1001) {
            studentsList[1] = teacher.printInfoToConsole();
        }
        i++;
    }

    @Override
    public String printInfoToConsole() {
        return "Адресс университета:" + this.address + "\n" +
                "Список учителей: " + Arrays.toString(this.teachersList) + "\n" +
                "Список учеников: " + Arrays.toString(this.studentsList);
    }
}
