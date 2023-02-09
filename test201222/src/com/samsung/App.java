package com.samsung;

import com.samsung.exeption.MyExc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Ввод не корректен!");
        }finally {
            scanner.close();
        }
        System.out.println("что-то делается....");


        try {
            test();
        } catch (MyExc e) {
            throw new RuntimeException(e);
        }
    }




    public static void test() throws MyExc {

        if (Math.random() < 0.5) {
            throw new MyExc();
        }else {
            System.out.println("Hello");
        }
    }
}
