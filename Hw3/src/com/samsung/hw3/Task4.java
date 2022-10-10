package com.samsung.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = b / a;
        if (a <= 0 && b <= 0) {
            System.out.println("no such x");
        } else {
            if (a >= 0 && b >= 0) {
                System.out.println("any x");
            }
        }
        if (a > 0 && b < 0) {
            System.out.printf("x<%.1f or x>%.1f", c, -c);
        }
        if (a < 0 && b > 0) {
            System.out.printf("%.1f<x<%.1f", c, -c);
        }
    }
}
