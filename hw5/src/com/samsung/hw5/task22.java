package com.samsung.hw5;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                int a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
            }
        }
        for (int i = 0; i < (array.length - 1); i++) {
            if ((array[i] + 1) != array[i + 1]) {
                System.out.println(array[i] + 1);
                break;
            }
            if (array[0] != 1) {
                System.out.println(1);
                break;
            }
            if (array[array.length - 1] != n) {
                System.out.println(n);
                break;
            }
        }
        if (n == 1) System.out.println(1);
    }
}
