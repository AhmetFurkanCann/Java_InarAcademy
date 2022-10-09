package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println(" Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f" , mean(numbers));
        System.out.println();
        System.out.printf("The standard deviation is %.5f" , deviation(numbers));
    }
    public static double deviation(double[] numbers){
        double deviationSquare = 0 ;
        double mean = 0;
        for (int i = 0; i < numbers.length; i++) {
            mean += numbers[i];
            deviationSquare += Math.pow(numbers[i], 2);
        }
        double deviation = Math.sqrt((deviationSquare - (Math.pow(mean, 2) / 10)) / (10 - 1));
        return deviation ;
    }
    public static double mean(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length ;
    }
}
