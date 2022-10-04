package com.samsung.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        short a, b;
        int res;
        a = x.nextShort();
        b = y.nextShort();

        res = a * a + b * b;

        System.out.println(res);

    }
}