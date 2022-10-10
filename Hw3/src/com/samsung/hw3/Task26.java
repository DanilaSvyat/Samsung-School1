package com.samsung.hw3;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = 0;
        if (a < b) {
            d = a;
            a = b;
            b = d;
        }
        if (a < c) {
            d = a;
            a = c;
            c = d;
        }
        if (b + c <= a) System.out.println("impossible");
        else if (a * a > b * b + c * c) System.out.println("obtuse");
        if (a * a == b * b + c * c) System.out.println("right");
        if (a * a < b * b + c * c) System.out.println("acute");
    }
}