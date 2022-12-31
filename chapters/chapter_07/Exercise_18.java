package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten double numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextDouble();
        }
        bubbleSort(numbers);
        displayArray(numbers);

    }

    public static void bubbleSort(double[] numbers) {
        boolean ordered;
        do {
            ordered = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    ordered = false;
                }
            }
        } while (!ordered);
    }

    public static void displayArray(double[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
