package chapters.chapter_13;

import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("Before Sort : " + list);
        sort(list);
        System.out.println("After Sort : " + list);
    }
    private static void sort(ArrayList<Integer> list) {
        boolean ordered;
        do {
            ordered = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i , list.get(i + 1));
                    list.set(i + 1 , temp) ;
                    ordered = false;
                }
            }
        } while (!ordered);
    }
}
