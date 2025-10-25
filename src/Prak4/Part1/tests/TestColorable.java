package Prak4.Part1.tests;

import Prak4.Part1.Colorable;
import Prak4.Part1.GeometricObject;
import Prak4.Part1.IllegalTriangleException;
import Prak4.Part1.figures.Circle;
import Prak4.Part1.figures.Rectangle;
import Prak4.Part1.figures.Square;
import Prak4.Part1.figures.Triangle;

public class TestColorable {
    public static void main(String[] args) throws IllegalTriangleException {
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(5);
        shapes[3] = new Triangle(3, 4, 5);
        shapes[4] = new Square(2.5);

        for (GeometricObject shape : shapes) {
            System.out.println("\n" + shape);
            System.out.println("Площадь: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}