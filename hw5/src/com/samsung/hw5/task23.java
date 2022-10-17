package com.samsung.hw5;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        while (a <= n * n) {
            System.out.print(a + " ");
            a = a + n + 1;
        }
    }
}