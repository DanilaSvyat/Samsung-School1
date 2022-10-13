package com.samsung.hw4;

import java.util.Scanner;

public class task22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int n = 0;
        int v = 0;
        int j = 0;
        if (a < 0) {
            a = -a;
            v++;
        }
        if (b < 0) {
            b = -b;
            j++;
        }
        while (n < a) {
            n++;
            sum += b;
        }
        if (j > 0)
            sum = -sum;
        if (v > 0)
            sum = -sum;
        System.out.println(sum);
    }
}
