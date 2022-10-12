package com.samsung.hw4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        n = scanner.nextInt();


        while (n >= 10 && n <= 99) {

            sum += n / 10 + n % 10;
            n = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
