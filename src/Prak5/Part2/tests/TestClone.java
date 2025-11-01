package Prak5.Part2.tests;

import Prak5.Part2.MyStackCloneable;

import java.util.Date;

public class TestClone {
    public static void main(String[] args) {
        MyStackCloneable stack = new MyStackCloneable();
        stack.push("alpha");
        stack.push(new Date());

        MyStackCloneable copy = (MyStackCloneable) stack.clone();

        System.out.println("Оригинал: " + stack);
        System.out.println("Копия:    " + copy);
    }
}