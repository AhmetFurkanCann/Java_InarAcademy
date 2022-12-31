package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter ten numbers :");
        for (int i = 0; i < list.length; i++) {
            list[i]=input.nextInt();
        }
        int[] eliminatedArray = eliminateDuplicates(list) ;
        displayArray(eliminatedArray);
    }

    public static void displayArray(int[] eliminatedArray) {
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < eliminatedArray.length; i++) {
            System.out.print(eliminatedArray[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminatedArray = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            boolean notContains = true;
            for (int j = 0; j < eliminatedArray.length; j++) {
                if(list[i] == eliminatedArray[j]){
                    notContains = false;
                }
            }
            if(notContains){
                eliminatedArray[count] = list[i] ;
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i]=eliminatedArray[i];
        }
        return result;
    }
}
