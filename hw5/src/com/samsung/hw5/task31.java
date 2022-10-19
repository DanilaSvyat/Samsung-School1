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
        for (int i = a-1; i <= b-1; i++) {
            int c = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = c;
            a++;
            b--;
        }

        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = c-1; i <= d-1; i++) {
            int e = arr[c-1];
            arr[c-1] = arr[d-1];
            arr[d-1] = e;
            c++;
            d--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
