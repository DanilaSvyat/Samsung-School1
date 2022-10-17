package com.samsung.hw5;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 1;
        if (n != 0) arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
            a *= arr[i];
        }
        System.out.println(a);
    }
}
