package com.samsung;

import com.samsung.model.Animals;

public class App {
    public static void main(String[] args) {

    Animals barsik = new Animals("Barsik", "Aleksandr", "Cat");
    Animals barbos = new Animals("Barbos", "Igor", "Dog");


    barsik.printInfo();
    barbos.printInfo();

    barsik.newVisit("9.11.2022");
        barsik.visitsList();
    }
}
