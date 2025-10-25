package Prak4.Part1.figures;

import Prak4.Part1.Colorable;
import Prak4.Part1.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) { this.side = side; }
    public double getSide() { return side; }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Раскрасьте квадрат");
    }

    @Override
    public String toString() {
        return "Квадрат: сторона = " + side;
    }
}
