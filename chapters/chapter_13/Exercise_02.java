package chapters.chapter_13;

import java.util.ArrayList;

public class Exercise_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Before Shuffle : " + list);
        shuffle(list);
        System.out.println("After Shuffle : " + list);
    }

    private static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomNumber = (int) (Math.random() * list.size());
            int temp = list.get(randomNumber);
            list.set(randomNumber , list.get(i));
            list.set(i , temp);
        }
    }
}
