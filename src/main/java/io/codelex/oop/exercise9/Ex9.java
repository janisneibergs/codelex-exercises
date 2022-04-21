package io.codelex.oop.exercise9;

public class Ex9 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12, 15);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(15, 10);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Hexagon hexagon = new Hexagon(25);
        System.out.println(hexagon.getArea());
        System.out.println(hexagon.getPerimeter());

        Cone cone = new Cone(25, 10);
        System.out.println(cone.calculateVolume());

        Qube qube = new Qube(20);
        System.out.println(qube.calculateVolume());

    }
}
