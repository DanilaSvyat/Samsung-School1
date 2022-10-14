package com.samsung.hw4;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a;
        int b = 0;
        boolean flag = false;
        do {
            a = N % 10;
            if (a == b) {
                flag = true;
                break;
            }
            b = a;
            N /= 10;
        }
        while (N != 0);
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
