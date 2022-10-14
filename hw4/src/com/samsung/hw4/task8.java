package com.samsung.hw4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a;
        do {
            a = N % 10;
            if (a % 2 != 0) {
                System.out.println(a);
                break;
            }
            N /= 10;
        }
        while (N != 0);
        if (a % 2 == 0) System.out.println("NO");
    }
}

