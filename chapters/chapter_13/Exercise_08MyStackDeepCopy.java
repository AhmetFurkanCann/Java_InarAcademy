package chapters.chapter_13;

import java.util.ArrayList;

public class Exercise_08MyStackDeepCopy implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Exercise_08MyStackDeepCopy newStack = (Exercise_08MyStackDeepCopy) super.clone();
        ArrayList<Object> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i));
        }
        newStack.list =result ;
        return newStack;
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
