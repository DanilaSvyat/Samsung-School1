package com.samsung;

public class App {

    public static void main(String[] args) {


        System.out.println(nFib(50));


    }

    public static double nPow(double x, int n){

        double y;
        if (n ==0){
            return 1;
        }else {
            y = x * nPow(x, n - 1);
        }
        return y;
    }
    static long nFib(int n) {
        if (n == 0 || n == 1)
            return 1;// Условие завершения рекурсии – «заглушка»
        return nFib(n - 1) + nFib(n - 2);//возвращаем сумму предыдущих чисел
    }
}
