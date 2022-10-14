package com.samsung.hw4;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double b = 1;
        int i = 1;
        if (n != 0) {
            if (n != 1) {
                if (n % 2 == 0) {
                    do {
                        b = b * a;
                        i++;
                    } while (i <= n / 2);
                    System.out.println(b * b);
                } else {
                    do {
                        b = b * a;
                        i++;
                    } while (i < n);
                    System.out.println(a * b);
                }
            } else System.out.println(a);
        } else System.out.println(b);
    }
}