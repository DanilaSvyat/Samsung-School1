package com.samsung.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int rub, kol, kop, resrub, reskop;
        double sum, res, h;
        rub = a.nextShort();
        kop = a.nextShort();
        kol = a.nextShort();
        rub = (rub  * kol) + (kop * kol / 100);
        kop = (kop * kol) % 100;

        System.out.println(rub + " " + kop);
    }
}