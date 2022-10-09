package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter five numbers :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=input.nextInt();
        }
        System.out.println("GCD of numbers is : " + gcd(numbers));
    }
    public static int gcd(int... numbers){
        int min = getMin(numbers);
        int gcd = 1 ;
        for (int i = 2; i <= min; i++) {
            boolean isGcd = true ;
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j] % i != 0){
                    isGcd = false;
                    break;
                }
            }
            if (isGcd){
                gcd= i ;
            }
        }
        return gcd ;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
