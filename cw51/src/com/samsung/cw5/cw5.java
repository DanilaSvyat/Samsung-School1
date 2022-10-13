package com.samsung.cw5;

    public class cw5 {
        public static void main(String[] args) {
            int[] array = new int[100];
            double res = 0;
            for (int i = 0; i < array.length; i++) {

                array[i] = (int) (Math.random() * 100);
                System.out.print(array[i] + " ");
                res += array[i];
            }
            System.out.println("\n" + res / array.length);

    }
}
