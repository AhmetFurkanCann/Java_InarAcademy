package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];
        System.out.println("Enter the integers between 1 and 100:");
        int number ;
        do {
           number = input.nextInt();
           if(number > 0) {
               numbers[number - 1]++;
           }
        }while(number != 0);

        displayOccurence(numbers);
    }

    public static void displayOccurence(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println((i + 1) + " occurs " + numbers[i] + " times");
            }
        }
    }
}
