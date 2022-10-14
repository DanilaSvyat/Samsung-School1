package com.samsung.hw4;

import java.util.Scanner;

public class example {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            boolean finding = true;

            while (finding){
                n++;
                boolean isPrime = true;
                for (int i = 2; i < n / 2; i++) {
                    if (n % i == 0) isPrime = false;
                }
                if (isPrime) finding = false;
            }

            System.out.println( n );

        }
    }

