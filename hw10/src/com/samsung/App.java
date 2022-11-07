package com.samsung;

import com.samsung.fraction.Fraction;

public class App {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(7, 9);
        Fraction fraction2 = new Fraction(8, 10);


        System.out.println(Fraction.fractionDivision(fraction1, fraction2));
        System.out.println(fraction1.fractionDeduction(fraction1, fraction2));
        System.out.println(fraction1.fractionMultiplication(fraction1, fraction2));
    }
}
