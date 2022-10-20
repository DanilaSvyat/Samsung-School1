package com.samsung.hw6;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(min(a, b, c, d));
    }
    public static int minOfTwo(int a, int b){
        int min;
        if (a<b) min = a;
        else min = b;
        return min;
    }
    public static int min(int a, int b, int c, int d){
        if (minOfTwo(a,b) < minOfTwo(c,d)) {
            return minOfTwo(a,b);
        }else return minOfTwo(c,d);
    }
}
