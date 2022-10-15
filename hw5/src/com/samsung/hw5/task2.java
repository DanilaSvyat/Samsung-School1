package com.samsung.hw5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        boolean f = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                sum += array[i];
                f = false;
            }
        }
        if (f) System.out.println("NO");
        else System.out.println(sum);
    }
}
