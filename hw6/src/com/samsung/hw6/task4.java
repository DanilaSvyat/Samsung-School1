package com.samsung.hw6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        binFraction(x, n);
    }

    public static void binFraction(double x, int n) {
        for (int i = 0; i < n; i++) {
            x *= 2;
            System.out.print((int) x);
            if (x >= 1) x -= 1;
        }
    }
}
