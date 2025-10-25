package Prak4.Part1.figures;

import Prak4.Part1.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) { this.width = width; }
    public double getWidth() { return width; }

    public void setHeight(double height) { this.height = height; }
    public double getHeight() { return height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public double getArea() { return width * height; }

    @Override
    public String toString() {
        return "Прямоугольник: ширина = " + width +
                ", высота = " + height;
    }
}
