package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10 ; i++) {
            int number = input.nextInt();
            if(notContains(numbers , number , count)){
                numbers[count]= number;
                count++;
            }
        }
        System.out.println("The number of distinct number is : " + count);
        System.out.print("The distinct numbers are: ");
        printArray(numbers , count);
    }

    public static void printArray(int[] numbers, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean notContains(int[] numbers, int number, int count) {
        for (int i = 0; i < count; i++) {
            if(number == numbers[i]){
                return false;
            }
        }
        return true;
    }
}
