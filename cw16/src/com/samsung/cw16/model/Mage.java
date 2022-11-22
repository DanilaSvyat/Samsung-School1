package com.samsung.cw16.model;

public class Mage extends Unit{

    private int mp;

    public Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("====================\n")
                .append(getClass().toString()).append("\n")
                .append("===================").append("\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Hp: ").append(getHp()).append("\n")
                .append("Mp: ").append(getMp()).append("\n");

        return builder.toString();
    }
    public int getMp() {
        return mp;
    }
}
