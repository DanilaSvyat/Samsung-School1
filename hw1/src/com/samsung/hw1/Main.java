package com.samsung.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int n, hours, min, sec;
        n = a.nextInt();
        n = n % 86400;
        hours = n / 3600;
        n = n - (3600 * hours);
        min = n / 60;
        n = n - (60 * min);
        sec = n;
        System.out.println(hours + ":" + min/10+ +min%10 + ":" + sec/10+ +sec%10);
    }
}