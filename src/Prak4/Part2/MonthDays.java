package Prak4.Part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner userMonth = new Scanner(System.in);

        try {
            System.out.print("Введите номер месяца: ");
            int numMonth = userMonth.nextInt();

            System.out.println("Месяц: " + months[numMonth - 1]);
            System.out.println("Количество дней: " + dom[numMonth - 1]);

        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Недопустимый номер месяца");
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число");
        }

        userMonth.close();
    }
}