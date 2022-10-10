package com.samsung.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n % 100 < 20 && n % 100 > 10) {
            System.out.println(n + " TORTOV");
            }else{

            switch (n % 10) {
                case 1:
                    System.out.println(n + " TORT");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(n + " TORTA");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println(n + " TORTOV");
            }
        }
    }
}