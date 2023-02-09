package com.samsung.exeption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

       File file = new File("C:\Users\Данил\Desktop\a.txt");

       Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
