package com.samsung.hw3;

import java.util.Scanner;

public class Tast23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String s1 = "";
        switch (x) {
            case 100:
                s1 = "C";
            case 90:
                s1 += s1;
            case 3:
                s1 += s1;
            case 4:
                s1 += s1;
        }
        System.out.println(s1);
    }
}
