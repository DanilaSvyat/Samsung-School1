package com.samsung.hw3;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;

        if (a > 0 && a <= 12) {
            switch (a) {
                case 1:
                    if (b <= 31) System.out.println(365 - b);
                    else System.out.println("-1");
                    break;
                case 2:
                    if (b <= 28) System.out.println(365 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 3:
                    if (b <= 31) System.out.println(365 - 31 - 28 - b);
                    else System.out.println("-1");
                    break;
                case 4:
                    if (b <= 30) System.out.println(365 - 31 - 28 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 5:
                    if (b <= 31) System.out.println(365 - 31 - 28 - 31 - 30 - b);
                    else System.out.println("-1");
                    break;
                case 6:
                    if (b <= 30) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 7:
                    if (b <= 31) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - b);
                    else System.out.println("-1");
                    break;
                case 8:
                    if (b <= 31) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 9:
                    if (b <= 30) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 10:
                    if (b <= 31) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - b);
                    else System.out.println("-1");
                    break;
                case 11:
                    if (b <= 30) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - b);
                    else System.out.println("-1");
                    break;
                case 12:
                    if (b <= 31) System.out.println(365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 - b);
                    else System.out.println("-1");
                    break;
            }
        } else System.out.println("-1");
    }
}