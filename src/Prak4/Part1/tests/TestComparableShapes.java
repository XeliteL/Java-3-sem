package Prak4.Part1.tests;

import Prak4.Part1.GeometricObject;
import Prak4.Part1.IllegalTriangleException;
import Prak4.Part1.figures.Circle;
import Prak4.Part1.figures.Rectangle;
import Prak4.Part1.figures.Triangle;

public class TestComparableShapes {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(3, 4, 5);
            Triangle t2 = new Triangle(6, 8, 10);
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(10);
            Rectangle r1 = new Rectangle(4, 6);
            Rectangle r2 = new Rectangle(2, 3);

            System.out.println("Площадь t1 = " + t1.getArea());
            System.out.println("Площадь t2 = " + t2.getArea());
            System.out.println("Наибольший треугольник: " + GeometricObject.max(t1, t2));

            System.out.println("\nПлощадь c1 = " + c1.getArea());
            System.out.println("Площадь c2 = " + c2.getArea());
            System.out.println("Наибольший круг: " + GeometricObject.max(c1, c2));

            System.out.println("\nПлощадь r1 = " + r1.getArea());
            System.out.println("Площадь r2 = " + r2.getArea());
            System.out.println("Наибольший прямоугольник: " + GeometricObject.max(r1, r2));

            GeometricObject larger = GeometricObject.max(c1, t1);
            System.out.println("\nНаибольшая фигура между кругом и треугольником: " + larger);

        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}