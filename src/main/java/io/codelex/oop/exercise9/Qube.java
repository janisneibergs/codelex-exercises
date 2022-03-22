package io.codelex.oop.exercise9;

public class Qube extends Shape3D {

    private int length;

    public Qube(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return length * length * length;
    }
}
