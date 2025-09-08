package Prak1;

import java.util.Scanner;

public class computeAndInteprateBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        //Получение веса в кг
        System.out.print("Введите вес в кг: ");
        weight = input.nextDouble();

        //Получение роста в см
        System.out.print("Введите рост в см: ");
        height = input.nextDouble();

        //Получение bmi
        bmi = weight / (Math.pow(height / SMS_PER_METER, 2));

        //Отображение и интерпретация
        System.out.print("Ваш BMI равен " + bmi + "\n");
        if (bmi < 18.5) {
            System.out.print("Недостаточный вес");
        } else if (bmi < 25) {
            System.out.print("Норма");
        } else if (bmi < 30) {
            System.out.print("Избыточный вес");
        } else {
            System.out.print("Ожирение");
        }
    }
}