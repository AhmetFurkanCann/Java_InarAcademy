package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_10MyStack extends ArrayList<Object> {

    public Exercise_10MyStack() {

    }

    public boolean isEmpty() {
        return isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object pop() {
        Object o = get(size() - 1 );
        remove(o);
        return o;
    }
    public Object peek() {
        return get(size() - 1);
    }

    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack : " + super.toString();
    }
}
