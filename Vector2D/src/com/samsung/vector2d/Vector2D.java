package com.samsung.vector2d;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count;

    public Vector2D() {
        count++;
        vX = 1;
        vY = 1;
    }

    public Vector2D(double vX, double vY) {
        count++;
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D v) {
        count++;
        this.vX = v.vX;
        this.vY = v.vY;
    }

    public void print() {
        System.out.print("(");
        System.out.print(String.format(Locale.US, "%.2f", vX));
        System.out.print(", ");
        System.out.print(String.format(Locale.US, "%.2f", vY));
        System.out.print(")");
        System.out.println();
    }

    public double length() {
        return Math.sqrt((vX * vX + vY * vY));
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        double temp = this.length();
        this.vX /= temp;
        this.vY /= temp;
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }

}

