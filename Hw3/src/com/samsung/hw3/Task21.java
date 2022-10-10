package com.samsung.hw3;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n <= 12){
            switch (n) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
            }
        }else {
            System.out.println("0");
        }
    }
}
