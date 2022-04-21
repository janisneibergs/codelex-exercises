package io.codelex.oop.exercise9;

public class Hexagon extends Shape {
    private int length;

    public Hexagon(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 3 * Math.sqrt(3 * length * length) / 2;
    }

    @Override
    public double getPerimeter() {
        return length * 6;
    }
}
