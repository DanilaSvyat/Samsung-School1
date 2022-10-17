package com.samsung.hw5;

import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a - 1; i <= (b + a - 2) / 2; i++) {
            int c = arr[i];
            arr[i] = arr[b - i + a - 2];
            arr[b - i + a - 2] = c;
        }
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = c - 1; i <= (d + c - 2) / 2; i++) {
            int e = arr[i];
            arr[i] = arr[d - i + c - 2];
            arr[d - i + c - 2] = e;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
