package com.samsung.cw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 19, 20, -100, 1000};
        int[] arr1 = {101, 19, 19, 20, -100, 1000};

        printArray(arr);
        System.out.println(printArray1(arr));
        printArray(arr1);

        int res = max(7, 10);

        System.out.println(res);

    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static String printArray1(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}




