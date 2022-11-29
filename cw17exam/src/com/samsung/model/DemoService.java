package com.samsung.model;

public class DemoService {
    private String[] University;

    public DemoService() {
    }
    public void demo(){
        Student student1 = new Student("Valera","Ivanov","Valerievich",
                "+79123123123","10A");
        Student student2 = new Student("Vitalii","Ivanov","Valerievich",
                "+79123123123","10A");
        Teacher teacher1 = new Teacher("Valeriy","Ivanov","Gavrilovich","Math");
        University university = new University(student1,student2,teacher1);
        System.out.println(university.printInfoToConsole());
        System.out.println("Или так:" + "\n");
        university.newStudent(student1);
        university.newStudent(student2);
        university.newTeacher(teacher1);
        System.out.println(university.printInfoToConsole());
    }
}
