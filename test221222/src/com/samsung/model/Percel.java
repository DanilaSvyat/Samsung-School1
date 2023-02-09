package com.samsung.model;

public class Percel {

    private String nameSender;
    private String nameReciever;

    private int weight;

    public Percel(String nameSender, String nameReciever, int weight) {
        this.nameSender = nameSender;
        this.nameReciever = nameReciever;
        this.weight = weight;
    }

    public String getNameSender() {
        return nameSender;
    }

    public String getNameReciever() {
        return nameReciever;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Percel{" +
                "nameSender='" + nameSender + '\'' +
                ", nameReciever='" + nameReciever + '\'' +
                ", weight=" + weight +
                '}';
    }
}
