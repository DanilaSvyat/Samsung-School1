package com.samsung;

import com.samsung.model.Percel;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        args.length
        int arr[] = new int[10];
        for(int i = 0; i <= 10; i++) {
            arr[i] = i;
            try {
                stopThread();
            }
            catch (InterruptedException ex1) {
                System.out.println("Error");
            }

        }

        System.out.println(Arrays.toString(arr));
    }
    public String [] getFileList(String dirName) {
        File f = new File(dirName);



        return f.list();
        // Add YOUR CODE here
    }
    class Answer extends Thread {
        char chr;
        public Answer(char chr) {
            this.chr = chr;
        }
        @Override
        public void run() {
            try{
                for (int i = 0; i < 10; i++) {
                    System.out.print(chr);
                    sleep(1000);
                }
            } catch (InterruptedException e) {

            }

        }
        // Add YOUR CODE here
    }

}
