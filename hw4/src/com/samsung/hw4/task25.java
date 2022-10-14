package com.samsung.hw4;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a;
        int sum = 0;
        do {
            a = N % 10;
            sum += a;
            N /= 10;
        }
        while (N != 0);
        System.out.println(sum);
    }
}
