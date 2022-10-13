package com.samsung.hw4;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int c = 0;
       int i = 0;
       do {
           c +=2;
           System.out.print(c + " ");
           i++;
       }
       while (i < n);
    }
}
