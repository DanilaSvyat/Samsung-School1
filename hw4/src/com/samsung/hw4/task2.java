package com.samsung.hw4;


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        do {
            n = scanner.nextInt();
            if (n > 10) {
                sum = sum + n;
            }
        }
        while (n % 5 != 0);
        System.out.println(sum);
        }
    }

