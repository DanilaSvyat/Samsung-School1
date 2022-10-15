package com.samsung.hw5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        array[0] = 4;
        System.out.print(array[0] + " ");
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + 3;
            System.out.print(array[i] + " ");
        }
    }
}
