package com.samsung.hw4;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        int n = scanner.nextInt();
        boolean f = false;
        while (i <= n / 2) {
            if (n % i == 0) {
                f = true;
                break;
            }
            i++;
        }
        if (f) System.out.println("composite");
        else System.out.println("prime");
    }
}
