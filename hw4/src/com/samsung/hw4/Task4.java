package com.samsung.hw4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int n = 0;

        while (a >= b){
        n++;
        a -= b;
        }
        sum = n;

        System.out.println(sum + " " + a);
    }
}

