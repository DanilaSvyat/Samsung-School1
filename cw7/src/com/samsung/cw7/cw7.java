package com.samsung.cw7;

public class cw7 {
    public static void main(String[] args) {

        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random() * 10)];
        }

        fillArray(arr, 50);
        printArray(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i]+ " ");
        }*/

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");

                    break;
                }
            }
        }*/

    }

    public static void fillArray(int[][] arr, int limit) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * limit);
            }
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
