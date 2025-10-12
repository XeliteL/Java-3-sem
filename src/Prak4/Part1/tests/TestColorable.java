package Prak4.Part1.tests;

import Prak4.Part1.Colorable;
import Prak4.Part1.GeometricObject;
import Prak4.Part1.IllegalTriangleException;
import Prak4.Part1.figures.Circle;
import Prak4.Part1.figures.Rectangle;
import Prak4.Part1.figures.Square;
import Prak4.Part1.figures.Triangle;

public class TestColorable {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[5];

        try {
            objects[0] = new Square(4, "red", true);
            objects[1] = new Circle(3, "blue", false);
            objects[2] = new Rectangle(2, 5, "green", true);
            objects[3] = new Triangle(3, 4, 5);
            objects[4] = new Square(6, "yellow", true);
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        for (GeometricObject obj : objects) {
            System.out.println("\n" + obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof Colorable) {
                Colorable colorable = (Colorable) obj;
                colorable.howToColor();
            }
        }
    }
}