package Prak5.Part1.tests;

import Prak5.Part1.Num2.GenericStack;
import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            stack.push(input.nextLine());
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}
