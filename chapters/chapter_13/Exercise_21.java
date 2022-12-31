package chapters.chapter_13;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        Exercise_14Rational h = new Exercise_14Rational(-b , 2 * a);
        Exercise_14Rational k = new Exercise_14Rational((long) (4 * a * c - Math.pow(b , 2)), 4 * a) ;
        System.out.println("h is " + h  + " k is " + k);
    }
}
