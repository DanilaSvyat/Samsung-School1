package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean res = ((a % 2 == 0 && b % 2 == 0 ) || (a % 2 == 0 && c % 2 == 0) || (b % 2 == 0 && c % 2 == 0));
        System.out.println(res);
    }
}
