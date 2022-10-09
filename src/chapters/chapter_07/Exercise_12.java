package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println(" Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        numbers = reverseArray(numbers);
        printArray(numbers);
    }

    public static double[] reverseArray(double[] numbers) {
        for (int i = 0 , j = numbers.length - 1 ; j > i ; i++ , j--) {
            double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers ;

    }
    public static void printArray(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
