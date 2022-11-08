package chapters.chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise_21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger((Long.MAX_VALUE ) + "") ;
        int count = 0;
        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6: ");
        do {
            if (number.remainder(new BigInteger("5")).compareTo(new BigInteger("0")) == 0|| number.remainder(new BigInteger("6")).compareTo(new BigInteger("0")) == 0 ) {
                System.out.println(number);
                count++;
            }
            number = number.add(new BigInteger("1"));
        }while (count < 10 ) ;
    }
}
