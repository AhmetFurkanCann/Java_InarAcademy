package chapters.chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger((Long.MAX_VALUE) + "") ;
        int count = 0;
        do {
            if(isPrime(number)){
                System.out.println(number.toString());
                count++;
            }
            number = number.add(new BigInteger("1"));
        }while (count < 5) ;
    }

    private static boolean isPrime(BigInteger number) {
        for (BigInteger divisor = new BigInteger("2") ; divisor.compareTo(number.divide(new BigInteger("2"))) <= 0 ; divisor = divisor.add(new BigInteger("1"))) {
            if (number.remainder(divisor).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true ;
    }
}
