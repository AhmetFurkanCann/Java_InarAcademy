package chapters.chapter_10;

import java.util.Scanner;

public class Exercise_05TestStackOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = input.nextInt();
        Exercise_05StackOfIntegers stack = SmallestFactors(number);
        System.out.print("All smallest factors of " + number + " : " );
        printSmallestFactors(stack);
    }

    public static void printSmallestFactors(Exercise_05StackOfIntegers stack) {
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static Exercise_05StackOfIntegers SmallestFactors(int number) {
        Exercise_05StackOfIntegers stack = new Exercise_05StackOfIntegers();
        int factor = 2 ;

        while (number != 1){
            if (isPrime(factor)){
                while (number % factor == 0){
                    stack.push(factor);
                    number = number / factor ;
                }
            }
            factor++;
        }
        return stack;

    }
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2 ; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true ;
    }
}
