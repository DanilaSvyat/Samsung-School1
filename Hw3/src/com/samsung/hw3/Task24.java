package com.samsung.hw3;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a);
                }else {
                    System.out.println(a);
                }
            }else {
                System.out.println(c);
            }
        }else {
            if (b > c){
                if (a > c){
                    System.out.println(b);
                }else{
                    System.out.println(b);
                }
            }else {
                System.out.println(c);
            }
        }
    }
}