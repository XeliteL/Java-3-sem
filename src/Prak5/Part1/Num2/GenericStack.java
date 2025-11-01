package Prak5.Part1.Num2;

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;

    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) throw new RuntimeException("Стек пуст");
        return elements[size - 1];
    }

    public void push(E value) {
        if (size >= elements.length) expandCapacity();
        elements[size++] = value;
    }

    public E pop() {
        if (isEmpty()) throw new RuntimeException("Стек пуст");
        E value = elements[--size];
        elements[size] = null;
        return value;
    }

    private void expandCapacity() {
        E[] newArray = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}