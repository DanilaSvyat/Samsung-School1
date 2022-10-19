package com.samsung.hw6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfThirteen(n));
    }

    public static int sumOfDigits(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public static int sumOfThirteen(int n) {

        int res = 0;

        for (int i = 0; i < n; i++) {
            if (sumOfDigits(i) % 13 == 0) res++;
        }
        return res;
    }
}
