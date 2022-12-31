package chapters.chapter_13;

import java.math.BigInteger;

public class Exercise_18RationalBigInteger {
    public static void main(String[] args) {
        Exercise_15RationalBigInteger number;
        Exercise_15RationalBigInteger sum = new Exercise_15RationalBigInteger();
        for (int i = 1; i <= 99; i++) {
            number = new Exercise_15RationalBigInteger(new BigInteger(String.valueOf(i)), new BigInteger(String.valueOf(i + 1)));
            sum.add(number);
        }
        System.out.println("Result is : " + sum.toString());
    }
}
