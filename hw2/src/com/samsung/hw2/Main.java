package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        String res = x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO";
        System.out.println(res);
    }
}