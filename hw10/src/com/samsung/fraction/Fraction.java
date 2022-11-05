package com.samsung.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double fractionDeduction(int numerator, int numerator1, int denominator, int denominator1) {

        int generalDenominator = denominator * denominator1;
        numerator *= denominator1;
        numerator1 *= denominator;
        numerator -= numerator1;
        for (int i = 2; i < numerator; i++) {
            if (generalDenominator % i == 0 && numerator % i == 0) {
                generalDenominator /= i;
                numerator /= i;
                i--;
            }
        }
        return (numerator / generalDenominator);
    }

    public double fractionMultiplication(int numerator, int numerator1, int denominator, int denominator1) {
        numerator *= numerator1;
        denominator *= denominator1;
        return (numerator / denominator);
    }

    public static Fraction fractionDivision(Fraction fraction1, Fraction fraction2) {

        return (new Fraction(
                fraction1.numerator * fraction2.denominator,
                fraction1.denominator * fraction2.numerator
        ));
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}