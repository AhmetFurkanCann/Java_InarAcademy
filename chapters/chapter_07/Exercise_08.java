package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter the ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("Average of the numbers = " + average(numbers));
    }
    public static int average(int[] array) {
        int sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length ;
    }
    public static double average(double[] array) {
        double sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length ;
    }
}
