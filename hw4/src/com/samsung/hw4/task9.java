package com.samsung.hw4;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a = N % 10;
        N = N / 10;
        int b;
        do {
            b = N % 10;
            if (a > b && b != 0) a = b;
            N /= 10;
        }
        while (N != 0);
        if (a == 0) a = b;
        System.out.println(a);
    }
}