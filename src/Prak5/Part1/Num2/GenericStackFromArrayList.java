package Prak5.Part1.Num2;

import java.util.ArrayList;

public class GenericStackFromArrayList<E> extends ArrayList<E> {
    public int getSize() {
        return this.size();
    }

    public E peek() {
        if (this.isEmpty()) throw new RuntimeException("Стек пуст");
        return this.get(this.size() - 1);
    }

    public void push(E value) {
        this.add(value);
    }

    public E pop() {
        if (this.isEmpty()) throw new RuntimeException("Стек пуст");
        return this.remove(this.size() - 1);
    }

    public boolean isEmptyStack() {
        return this.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack" + super.toString();
    }
}