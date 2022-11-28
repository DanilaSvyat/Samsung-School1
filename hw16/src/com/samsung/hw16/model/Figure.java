package com.samsung.hw16.model;

public abstract class Figure implements Moveable {
    protected float x;
    protected float y;

    public abstract float getArea();

    public abstract float getPerimeter();

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
