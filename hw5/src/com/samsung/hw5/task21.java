package com.samsung.hw5;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 0;
        int b = N;
        while (b >= 1) {
            b = b / 2;
            a++;
        }
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = N % 2;
            N /= 2;
            System.out.print(array[i]);
        }
    }
}
