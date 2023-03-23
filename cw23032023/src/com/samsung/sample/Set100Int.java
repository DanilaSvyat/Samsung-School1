package com.samsung.sample;

import java.util.Arrays;

public class Set100Int {

    private boolean[] data = new boolean[100];

    public boolean add(int value){
        if (value > -1 && value < 100){
           data[value] = true;
           return true;
        } else return false;
    }

    public boolean contains(int value){
        if (value > -1 && value < 100)
                return data[value];
        else return false;
    }

    public boolean remove(int value){
        if (value > -1 && value < 100) {
            data[value] = false;
            return true;
        }
        else return false;
    }

    public void clear() {
        Arrays.fill(data, false);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < data.length; i++) {
            if(data[i])
                stringBuilder.append(i + " ");
        }

        return stringBuilder.toString();
    }
}
