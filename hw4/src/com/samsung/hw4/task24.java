package com.samsung.hw4;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = 9999;
        int k = 0;
        while (x <= 99999) {
            if (x % a == b && x % c == d) {
                k = x;
                System.out.print(k + " ");
            }
            x++;
        }
        if (k == 0) System.out.println("-1");
    }
}
