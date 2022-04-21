package io.codelex.oop.exercise9;

public class Cone extends Shape3D {

    private int height;
    private int radius;

    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return height * 3.14 * radius * radius / 3;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
