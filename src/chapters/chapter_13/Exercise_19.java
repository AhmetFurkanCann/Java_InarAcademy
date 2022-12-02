package chapters.chapter_13;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a decimal number : ");
        String s = input.nextLine();
        String[] array = s.split(",");
        int nominator = Integer.parseInt(array[0] + array[1]) ;
        int denominator = (int) Math.pow(10 , array[1].length());
        Exercise_15RationalBigInteger rationalNumber = new Exercise_15RationalBigInteger(new BigInteger(String.valueOf(nominator)) , new BigInteger(String.valueOf(denominator))) ;
        System.out.println("The fraction number is " + rationalNumber.toString());
    }
}
