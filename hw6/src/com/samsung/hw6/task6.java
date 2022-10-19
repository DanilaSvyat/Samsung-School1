package com.samsung.hw6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        minToBegin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void minToBegin(int[] arr) {
        int min = arr[0];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                a = i;
                min = arr[i];
            }
        }
        int temp = arr[0];
        arr[0] = min;
        for (int j = 1; j <= a; j++) {
            int temp1 = arr[j];
            arr[j] = temp;
            temp = temp1;
        }
    }
}