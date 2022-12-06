package chapters.MapQuestions;

import java.util.*;

public class Exercise_21_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        System.out.println("Enter the integers between 1 and 100:");
        int number;
        do {
            number = input.nextInt();
            if (number != 0) {
                if (!map.containsKey(number)) {
                    map.put(number, 1);
                } else {
                    int occurrence = map.get(number);
                    map.put(number, occurrence + 1);
                }

            }
        } while (number != 0);
        map = sortTheMap(map);
        displayOccurrence(map);
    }

    private static Map<Integer, Integer> sortTheMap(Map<Integer, Integer> map) {
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer number1, Integer number2) {
                return (number1).compareTo(number2);
            }
        });
        for (Integer number : list) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(number)) {
                    sortedMap.put(entry.getKey(), number);
                }
            }
        }
        return sortedMap;
    }

    private static void displayOccurrence(Map<Integer, Integer> map) {
        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        int value = map.get(keys.get(keys.size() - 1)) ;
        System.out.println( (keys.get(keys.size() - 1)) + " occurs  most " + map.get(keys.get(keys.size() - 1)) + " times");
        for (int i = keys.size() - 2; i >= 0; i--) {
            if (map.get(keys.get(i)) == value ){
                System.out.println( (keys.get(i)) + " occurs   most " + map.get(keys.get(i)) + " times");
            }
            else {
                break;
            }
        }

    }
}
