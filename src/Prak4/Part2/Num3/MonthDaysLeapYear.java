package Prak4.Part2.Num3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDaysLeapYear {
    public static void main(String[] args) {
        String[] months = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите номер месяца: ");
            int numMonth = input.nextInt();

            if (numMonth == 2) {
                System.out.println("Введите год: ");
                int year = input.nextInt();

                if (isLeapYear(year)) {
                    dom[1] = 29;
                }
            }

            System.out.println("Месяц: " + months[numMonth - 1]);
            System.out.println("\nКоличество дней: " + dom[numMonth - 1]);

        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Недопустимый номер месяца");
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число");
        }

        input.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 100 != 0 && year % 4 == 0);
    }
}