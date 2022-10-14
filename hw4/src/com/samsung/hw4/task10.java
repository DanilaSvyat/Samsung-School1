package com.samsung.hw4;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n++;
        int i = 2;
            do {
                if (n % i != 0) {
                    i++;
                } else {
                    i = 2;
                    n++;
                }
            }
            while (i <= n / 2);
        System.out.println(n);
    }
}
