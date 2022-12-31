package weeks.week_17;

import java.util.ArrayList;
import java.util.List;

public class SmallestElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100)) ;
        }
        System.out.println(list);
        int minIndex = getMinIndex(list);
        System.out.println(minIndex);
    }

    private static int getMinIndex(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1 ;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)< min){
                min = list.get(i);
                minIndex= i ;
            }
        }
        return minIndex;
    }
}
