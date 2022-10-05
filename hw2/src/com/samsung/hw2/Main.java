package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        String res = x * x + y * y < 1 || x * x + y * y > 1 && y < 1 && x < 1 && y > 0 && x > 0 ? "YES" : "NO";
        System.out.println(res);
    }
}
