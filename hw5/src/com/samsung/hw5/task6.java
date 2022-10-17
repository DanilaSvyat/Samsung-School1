package com.samsung.hw5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int[] array = new int[n];
        int[] number = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    number[i] += 1;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] > number[0]) {
                number[0] = number[i];
                a = i;
            }
        }
        System.out.println(array[a]);
    }
}

