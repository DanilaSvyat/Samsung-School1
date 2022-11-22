package com.samsung.cw16;

import com.samsung.cw16.model.Mage;
import com.samsung.cw16.model.Unit;
import com.samsung.cw16.model.Warrior;

public class App {


    public static void main(String[] args) {
        Unit unit1 = new Unit(
                "Мудрый дуб",
                100
        );
        Warrior warrior1 = new Warrior(
                "Valera",
                250,
                100
        );

        Mage mage1 = new Mage(
                "Vitalii",
                90,
                40
        );

        System.out.println(unit1);
        System.out.println(warrior1);

    }
}
