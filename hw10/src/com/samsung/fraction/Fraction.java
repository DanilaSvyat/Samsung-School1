package com.samsung.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    private int gcd(int numerator, int denominator) {
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }

    private void normalization() {
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }

    public static Fraction fractionDivision(Fraction fraction1, Fraction fraction2) {

        return (new Fraction(
                fraction1.numerator * fraction2.denominator,
                fraction1.denominator * fraction2.numerator
        ));
    }

    public Fraction fractionMultiplication(Fraction fraction1, Fraction fraction2) {
        return (new Fraction(
                fraction1.numerator * fraction2.numerator,
                fraction1.denominator * fraction2.denominator
        ));
    }

    public Fraction fractionDeduction(Fraction fraction1, Fraction fraction2) {

        return (new Fraction(fraction1.numerator * fraction2.denominator - fraction2.numerator * fraction1.denominator, fraction1.denominator * fraction2.denominator));
    }
}