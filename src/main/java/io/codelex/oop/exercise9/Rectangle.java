package io.codelex.oop.exercise9;

public class Rectangle extends Shape {
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public double getPerimeter() {
        return (height + length) * 2;
    }
}
