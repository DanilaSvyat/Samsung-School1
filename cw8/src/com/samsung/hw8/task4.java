package com.samsung.hw8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        int N = in.nextInt ( );
        int M = in.nextInt ( );
        int [][] a=new int[N][M];
        int i=0;
        for(int j=0;j<M;j++){
            a[i][j]=i*j;
            System.out.print (a[i][j]+" " );
            if(j==M-1){
                System.out.println ();
                i++;
                j=0;
            }
        }
    }
}