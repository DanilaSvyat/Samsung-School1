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
        Student[] ad = {student1,student2};
        Teacher[] af = {teacher1};
        University university = new University(ad,af);
        System.out.println(university.printInfoToConsole());

    }
}
