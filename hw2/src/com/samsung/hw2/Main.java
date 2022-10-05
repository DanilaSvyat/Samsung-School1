package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean res = a == -b || a == -c || a == -d || b == -c || b == -d || c == - d;
        System.out.println(res);
    }
}