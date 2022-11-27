package com.samsung.cw16.model;

public class Mage extends Unit{
    private int mp;

    public Mage(String name, int hp) {
        super(name, hp);
        this.mp = 50;
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

    @Override
    public void sayHello() {
        System.out.println("Привет, я маг!");
    }

    public int getMp() {
        return mp;
    }


    @Override
    public Unit attack(Unit unit) {

        if (this.mp > 0){
            this.mp -= 5;
            unit.getDmg(K_DMG * 4);
        }else {
            unit.getDmg(K_DMG);
        }
        return unit;
    }

    @Override
    public void getDmg(int dmg) {
        this.hp -= dmg;
    }
}
