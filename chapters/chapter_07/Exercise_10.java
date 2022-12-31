package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter the ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("Index Of The Smallest Element is : " + indexOfSmallestElement(numbers));
    }
    public static int indexOfSmallestElement(double[] array) {
        int smallestIndex = 0;
        double smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }
}

