package Prak5.Part2.tests;

import Prak5.Part2.MyStack;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

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