package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        boolean res = -3 <= x && x <= 5 || 9 <= x && x <= 15;
        System.out.println(res);
    }
}
