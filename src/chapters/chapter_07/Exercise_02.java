package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 10;
        int[] numbers = new int[numberOfStudents];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();
        }
        displayInReverseOrder(numbers);
    }

    public static void displayInReverseOrder(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
