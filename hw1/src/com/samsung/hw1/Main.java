package com.samsung.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        short rub, kol, kop, resrub, reskop;
        double sum, res, h;
        rub = a.nextShort();
        kop = b.nextShort();
        kol = n.nextShort();
        sum = ((double) kop / 100) + rub;
        res = sum * kol;
        resrub = (short) res;
        h = res * 100;
        reskop = 0;
        reskop += h % 10;
        h /= 10;
        reskop += h % 10;
        System.out.println(resrub + " " + reskop);
    }
}