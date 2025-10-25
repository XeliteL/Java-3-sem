package Prak4.Part1.tests;

import Prak4.Part1.ComparableCircle;
import Prak4.Part1.GeometricObject;
import Prak4.Part1.figures.Circle;
import Prak4.Part1.figures.Rectangle;

public class TestComparableFigures {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        System.out.println("\nБольший круг: " + GeometricObject.max(c1, c2));

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        System.out.println("Больший прямоугольник: " + GeometricObject.max(r1, r2));

        ComparableCircle cc1 = new ComparableCircle(3);
        ComparableCircle cc2 = new ComparableCircle(4);
        System.out.println("\nСравнение двух ComparableCircle:");
        if (cc1.compareTo(cc2) > 0)
            System.out.println("Первый круг больше");
        else if (cc1.compareTo(cc2) < 0)
            System.out.println("Второй круг больше");
        else
            System.out.println("Они равны");
    }
}