package com.samsung.model;

import java.util.Arrays;
import java.util.Date;

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
        if (visitCount < datesOfVisit.length) {
            datesOfVisit[visitCount] = dateOfVisit;
            visitCount++;
        } else {
            String[] datesOfVisit1 = new String[datesOfVisit.length * 2];
            for (int i = 0; i < datesOfVisit.length; i++) {
                datesOfVisit1[i] = datesOfVisit[i];
            }
            datesOfVisit1[visitCount] = dateOfVisit;
            visitCount++;
            datesOfVisit = datesOfVisit1;
        }
        return datesOfVisit;
    }

    public void visitsList() {
        for (String s : datesOfVisit) {
            if (s != null)
                System.out.print(s + " ");
        }
    }
}
