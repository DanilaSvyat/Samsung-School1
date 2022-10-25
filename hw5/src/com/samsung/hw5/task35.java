package com.samsung.hw5;

import java.util.Scanner;

public class task35 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int[] arr = new int[n];
            arr[0] = scanner.nextInt();
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] > max ) max = arr[i];
            }
            System.out.println(max);
        }
    }
