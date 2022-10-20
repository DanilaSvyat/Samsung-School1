package com.samsung.hw6;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println(trianglePerimetr(x1, y1, x2, y2, x3, y3));
    }

    public static double segmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x3, y3, x1, y1);
    }
}
