package com.samsung.hw16.model;

public class Rectangle extends Figure {
    private float height;
    private float width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return height * width;
    }

    @Override
    public float getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(float koeff) {
        height *= koeff;
        width *= koeff;
    }

    @Override
    public String toString() {
        return "Rectangle" + "\n" +
                "Center: (" + x + ", " + y + ")" + "\n" +
                "Height: " + height + "\n" +
                "Width: " + width;
    }
}
