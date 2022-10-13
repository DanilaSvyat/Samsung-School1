package com.samsung.hw4;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c = 0;
        int a = 0;
        while (N > c) {
            a = scanner.nextInt();
            c++;
            if (a <= 437) {
                System.out.println("Crash " + c);
                break;
            }
        }
        if (a > 437)
            System.out.println("No crash");
    }
}
