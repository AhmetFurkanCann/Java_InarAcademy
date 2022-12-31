package chapters.chapter_10;

public class Exercise_10TestQueue {
    public static void main(String[] args) {
        Exercise_10Queue queue1 = new Exercise_10Queue();
        for (int i = 1; i < 21; i++) {
            queue1.enqueue(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(queue1.dequeue() + " ");
        }
    }
}
