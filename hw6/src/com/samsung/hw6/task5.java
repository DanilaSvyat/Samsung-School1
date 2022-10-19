package com.samsung.hw6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(avgOf4Digit(arr));
    }

    public static double avgOf4Digit(int[] arr) {
        double res = 0;
        int count = 0;
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1000 && arr[i] <= 9999) {
                res += arr[i];
                count++;
                f = true;
            }
        }
        if (f) res = res / count;
        else res = -1;
        return res;
    }
}
