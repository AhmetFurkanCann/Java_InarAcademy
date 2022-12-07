package chapters.MapQuestions;

import java.util.*;

public class SortingOnKeys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        fillTheMap(map);
        System.out.println(map.toString());
        map = sortTheMap(map);
        System.out.println(map.toString());
    }
    private static Map<Integer, Integer> sortTheMap(Map<Integer, Integer> map) {
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer number1, Integer number2) {
                return (number1).compareTo(number2);
            }
        });
        for (Integer number : list) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey().equals(number)) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return sortedMap;
    }
    private static void fillTheMap(Map<Integer, Integer> map) {
        for (int i = 0; i < 10; i++ ) {
            map.put((int) (Math.random() * 100) , (int) (Math.random() * 100));
        }
    }
}
