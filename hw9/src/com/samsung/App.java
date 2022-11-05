package com.samsung;

import java.util.Scanner;
K
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(x <= Byte.MAX_VALUE && x >= Byte.MIN_VALUE ? "YES" : "NO");
        System.out.println(x <= Short.MAX_VALUE && x >= Short.MIN_VALUE ? "YES" : "NO");



    }
}
