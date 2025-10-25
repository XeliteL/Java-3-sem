package Prak4.Part1.figures;

import Prak4.Part1.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public String toString() {
        return "Круг: радиус = " + radius;
    }
}
