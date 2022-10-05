package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        String res = y > 2 * x * x && y > 1 - x && x < 1 || y < 2 * x * x && x < 1 && y > 1 - x && x > 0 ? "YES" : "NO";
        System.out.println(res);
    }
}