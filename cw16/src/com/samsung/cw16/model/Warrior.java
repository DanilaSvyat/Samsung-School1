package com.samsung.cw16.model;

public class Warrior extends Unit {
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("====================\n")
                .append(getClass().toString()).append("\n")
                .append("===================").append("\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Hp: ").append(getHp()).append("\n")
                .append("Armor: ").append(getArmor()).append("\n");

        return builder.toString();
    }

    public int getArmor() {
        return armor;
    }
}
