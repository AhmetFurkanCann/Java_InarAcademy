package chapters.MapQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the integers between 1 and 100:");
        int number;
        do {
            number = input.nextInt();
            if (number > 0) {
                if (!map.containsKey(number)) {
                    map.put(number, 1);
                } else {
                    int occurrence = map.get(number);
                    map.put(number, occurrence + 1);
                }

            }
        } while (number != 0);

        displayOccurrence(map);
    }

    public static void displayOccurrence(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet)
            System.out.println(entry.getKey() + " occurs   " + entry.getValue() + "   times");
    }
}


