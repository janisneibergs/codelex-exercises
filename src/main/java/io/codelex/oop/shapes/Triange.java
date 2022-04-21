package io.codelex.oop.shapes;

public class Triange extends Shape {

    private double width;
    private double height;


    public Triange(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return ((width / 2) * height) / 2;

    }

    public double getPerimeter() {
        return 2 * (width + height);

    }
}
