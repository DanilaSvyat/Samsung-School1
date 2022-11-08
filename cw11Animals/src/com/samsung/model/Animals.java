package com.samsung.model;

import java.util.Arrays;

public class Animals {

    private String petName, ownerName, typeOfAnimal;

    private int visitCount;
    private String[] datesOfVisit;

    public Animals(String petName, String ownerName, String typeOfAnimal) {

        this.petName = petName;
        this.ownerName = ownerName;
        this.typeOfAnimal = typeOfAnimal;
        datesOfVisit = new String[3];
    }

    public void printInfo() {
        System.out.println("petName='" + petName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                '}');
    }

    public String[] newVisit(String dateOfVisit) {
        if (visitCount < dateOfVisit.length() && dateOfVisit[visitCount] == null)
        this.datesOfVisit[visitCount] = dateOfVisit;

        return this.datesOfVisit;
    }

    public void visitsList() {
        System.out.println(Arrays.toString(datesOfVisit));
    }
}
