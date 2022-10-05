package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double a = scanner.nextDouble();

        boolean res = a >= 3 && a <= 8;
        System.out.println(res);
    }
}
