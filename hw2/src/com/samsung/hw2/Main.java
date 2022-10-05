package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        boolean res = x < -2 || x > 3 && x < 6 || x > 9;
        System.out.println(res);
    }
}
