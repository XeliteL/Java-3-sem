package Prak1;

import java.util.Scanner;
import java.lang.Math;

public class convertValues2 {
    public String end;

    public String valueEnd(double value) {
        if (value >= 10 && value <= 20) {
            this.end = "ей";
        } else if (value % 10 == 1) {
            this.end = "ь";
        } else if (value % 10 >= 2 &&
                value % 10 <= 4) {
            this.end = "я";
        } else {
            this.end = "ей";
        } return this.end;
    }

    public static void main(String[] args) {
        convertValues2 convert = new convertValues2();

        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        String endYuans, endRoubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество юаней: ");
        yuan = input.nextInt();
        endYuans = convert.valueEnd(yuan);

        roubles = ROUBLES_PER_YUAN * yuan;
        roubles = Math.ceil(roubles);
        endRoubles = convert.valueEnd(roubles);

        System.out.print("Вы дали: " + yuan + " юан" + endYuans + "\n");
        System.out.print("Вы получили: " + (int)roubles + " рубл" + endRoubles);
    }
}