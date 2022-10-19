package com.samsung.hw6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumOfSeven(a, b));
    }

    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        while (a <= b) {
            if (a % 7 == 0 && a > 10 && a < 100) sum += sumOfDigits(a);
            a++;
        }
        return sum;
    }

    public static int sumOfDigits(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}