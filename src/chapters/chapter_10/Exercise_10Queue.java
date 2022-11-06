package chapters.chapter_10;

public class Exercise_10Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Exercise_10Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size == elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int number = elements[0];
        int[] temp = new int[size - 1];
        System.arraycopy(elements, 1, temp, 0, temp.length);
        elements = temp;
        size--;
        return number;
    }
    public boolean empty() {
        return size == 0 ;
    }

    public int getSize() {
        return size;
    }
}
