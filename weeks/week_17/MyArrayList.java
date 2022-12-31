package weeks.week_17;


import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10)) ;
        }
        System.out.println(list);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)< min){
                min=list.get(i);
            }
        }
        System.out.println(min);
    }
}
