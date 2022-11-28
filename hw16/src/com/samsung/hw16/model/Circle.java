package com.samsung.hw16.model;

public class Circle extends Figure {
    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }


    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public float getPerimeter() {
        return (float) Math.PI * 2 * radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }

    @Override
    public String toString() {
        return "Circle" + "\n" +
                "Center: (" + x + ", " + y + ")" + "\n" +
                "Radius: " + radius;
    }
}
