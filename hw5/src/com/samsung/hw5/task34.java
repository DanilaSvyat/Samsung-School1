package com.samsung.hw5;

import java.util.Scanner;

    public class task34 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int count = 0;

            int[] arr = new int[n];
            arr[0] = scanner.nextInt();

            for (int i = 1; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] > arr[i-1]) count++;
            }
            System.out.println(count);
        }
    }