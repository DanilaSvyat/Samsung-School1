package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        boolean res = x / 100 > 0 && x / 100 < 9 && x % 5 == 0;
        System.out.println(res);
    }
}