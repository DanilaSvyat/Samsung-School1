package com.samsung.cw16;

import com.samsung.cw16.model.Mage;
import com.samsung.cw16.model.Unit;
import com.samsung.cw16.model.Warrior;

public class App {


    public static void main(String[] args) {

        Warrior warrior1 = new Warrior(
                "Valera",
                100,
                10
        );

        Mage mage1 = new Mage(
                "Vitalii",
                60
        );

        System.out.println(mage1);
        System.out.println(warrior1);

        while (warrior1.getHp() > 0 && mage1.getHp() > 0) {

            warrior1.attack(mage1);
            mage1.attack(warrior1);
        }
        System.out.println("------------------------");

        System.out.println(mage1);
        System.out.println(warrior1);


    }
}
