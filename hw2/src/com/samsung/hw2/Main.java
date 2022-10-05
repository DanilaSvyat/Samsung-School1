package com.samsung.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();


        String res = x > 0 && y > 0 && y < Math.sin(x) && y < 0.5 && x < Math.PI  ? "YES" : "NO";
        System.out.println(res);
    }
}