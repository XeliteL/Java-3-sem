package Prak4.Part1.tests;

import Prak4.Part1.IllegalTriangleException;
import Prak4.Part1.figures.Triangle;

import java.util.Scanner;

public class TestTriangle {
    static void main() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите сторону 1: ");
            double side1 = input.nextDouble();

            System.out.print("Введите сторону 2: ");
            double side2 = input.nextDouble();

            System.out.print("Введите сторону 3: ");
            double side3 = input.nextDouble();

            System.out.print("Введите цвет: ");
            String color = input.next();

            System.out.print("Закрашен? (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println("\n" + triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.getFilled());

        } catch (IllegalTriangleException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Ошибка ввода: " + ex.getMessage());
        }

        input.close();
    }
}