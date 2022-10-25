package com.samsung.hw5;

import java.util.Scanner;

public class task33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
        }
    }
}