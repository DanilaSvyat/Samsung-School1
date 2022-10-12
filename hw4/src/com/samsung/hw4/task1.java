package com.samsung.hw4;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, count = 0;
        do {
            n = scanner.nextInt();
            count++;
        } while (n >= 0);

        System.out.println(count);
        scanner.close();
    }
}

