package com.samsung.cw5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*int n = scanner.nextInt();
        int count = 1;

        while (n >= 0) {
            n = scanner.nextInt();
            count++;
        }*/

        int n, count = 0;
        do {
            n = scanner.nextInt();
            count++;
        } while (n >= 0);


        System.out.println(count);
        scanner.close();
    }
}