package com.samsung.hw5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int X = scanner.nextInt();
        boolean f = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                System.out.println(i+1);
                f = false;
                break;
            }
        }
        if (f) System.out.println("NO");
    }
}
