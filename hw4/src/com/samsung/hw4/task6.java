package com.samsung.hw4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int a = 26;

        while (n >= a){
            sum += a;
            a += 2;
        }

        System.out.println(sum);
    }
}
