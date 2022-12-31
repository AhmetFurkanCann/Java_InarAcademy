package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * 10) ;
            counts[x]++;
        }
        displayOccurence(counts);
    }
    public static void displayOccurence(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i) + " occurs " + numbers[i] + " times");
        }
    }
}
