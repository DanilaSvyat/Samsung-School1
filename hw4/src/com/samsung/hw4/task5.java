package com.samsung.hw4;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int i = 0;
        do {
            N /= 2;
            i++;
        }
        while (N != 0);
        System.out.println(i);
    }
}

