package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        long n = input.nextLong();
        System.out.println("Sum of all digits of " + n + " is : " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0 ;
        while (n > 0) {
            sum+= n % 10 ;
            n /= 10 ;
        }
        return sum ;


    }
}
