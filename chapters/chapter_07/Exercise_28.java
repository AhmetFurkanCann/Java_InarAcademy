package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 Integers :");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        displayAllCombinations(list);
    }

    public static void displayAllCombinations(int[] list) {
        for (int i = 0; i < list.length - 1 ; i++) {
            for (int j = i + 1 ; j < list.length ; j++) {
                System.out.println("(" +i + " , " + j + ")");
            }

        }
    }
}
