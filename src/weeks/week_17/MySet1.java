package weeks.week_17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * 10)) ;
        }
        System.out.println(list);
        Set<Integer> set = uniqueElements(list);
        System.out.println(set);
    }

    private static Set<Integer> uniqueElements(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        return set ;
        }

    }
