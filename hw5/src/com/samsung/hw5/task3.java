package com.samsung.hw5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 != 0) {
                sum += array[i];
                a += 1;
            }
        }
        if (sum != 0) System.out.printf("%.2f", (double) sum / a);
        else System.out.println("NO");
    }
}
