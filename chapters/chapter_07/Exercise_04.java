package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[100];
        fillTheArrayWithNegativeNumbers(numbers);
        System.out.println("Enter the numbers : ");
        double number;
        int count = 0;
        do {
            number = input.nextDouble();
            numbers[count] = number;
            count++;

        } while (number >= 0);
        double average = getAverage(numbers , count - 1 );
        displayNumberOfScoresAboveOrBelowTheAverage(numbers, average);
    }

    public static void displayNumberOfScoresAboveOrBelowTheAverage(double[] numbers, double average) {
        int above = 0;
        int below = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                if (numbers[i] >= average) {
                    above++;
                } else {
                    below++;
                }
            }
        }
        System.out.println("Number of scores above or equal to the average : " + above);
        System.out.println("Number of scores below the average : " + below);
    }

    public static double getAverage(double[] numbers , int count) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0) {
                sum += numbers[i];
            }
        }
        return sum / count;
    }

    public static void fillTheArrayWithNegativeNumbers(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -1;
        }
    }
}
