package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheList(list);
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }


    private static void fillTheList(ArrayList<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int) (Math.random() * list.size()) ;
            int temp = list.get(index);
            list.set(index , list.get(i)) ;
            list.set(i , temp) ;
        }
    }
}
