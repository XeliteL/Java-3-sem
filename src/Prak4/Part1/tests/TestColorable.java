package Prak4.Part1.tests;

import Prak4.Part1.Colorable;
import Prak4.Part1.GeometricObject;
import Prak4.Part1.IllegalTriangleException;
import Prak4.Part1.figures.Square;
import Prak4.Part1.figures.Triangle;

public class TestColorable {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] shapes = new GeometricObject[3];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Square(2.5);
        shapes[2] = new Square(2.5);

        shapes[2].setColor("Синий");

        for (GeometricObject shape : shapes) {
            System.out.println("\n" + shape);
            System.out.println("Площадь: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}