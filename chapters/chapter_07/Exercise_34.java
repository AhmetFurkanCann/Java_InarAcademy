package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = input.nextLine();
        s = sort(s);
        System.out.println("Sorted String : " + s);
    }

    public static String sort(String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) s.charAt(i);
        }
        for (int i = 0; i < result.length - 1; i++) {
            int currentMin = result[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (currentMin > result[j]) {
                    currentMin = result[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                result[currentMinIndex] = result[i];
                result[i] = currentMin;
            }
        }
        String sortedString = "";
        for (int i = 0; i < result.length; i++) {
            sortedString += (char) (result[i]);
        }
        return sortedString;
    }
}
