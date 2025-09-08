package Prak1;

import java.util.Scanner;
import java.lang.Math;

public class convertValues1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество юаней: ");
        yuan = input.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("Ваша сумма рублей: ");
        System.out.print(Math.ceil(roubles));
    }
}