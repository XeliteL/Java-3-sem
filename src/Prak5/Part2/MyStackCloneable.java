package Prak5.Part2;

import java.util.ArrayList;
import java.util.Date;

public class MyStackCloneable implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) throw new RuntimeException("Стек пуст");
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) throw new RuntimeException("Стек пуст");
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "MyStack" + list.toString();
    }

    @Override
    public Object clone() {
        try {
            MyStackCloneable copy = (MyStackCloneable) super.clone();
            copy.list = new ArrayList<>();
            for (Object obj : this.list) {
                // Пример: если элемент клонируемый (например Date), создаём его копию
                if (obj instanceof Date) {
                    copy.list.add(((Date) obj).clone());
                } else {
                    // Остальные типы считаем неизменяемыми (String, Integer и т.п.)
                    copy.list.add(obj);
                }
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}