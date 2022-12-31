package chapters.chapter_10;

import java.math.BigDecimal;

public class Exercise_17 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        long smallestPow = (long) Math.sqrt(Long.MAX_VALUE) ;
        BigDecimal pow = new BigDecimal(smallestPow);
        int count = 0;
         do {
            BigDecimal result = pow.multiply(pow);
            if (result.compareTo(new BigDecimal(Long.MAX_VALUE)) > 0) {
                System.out.println(result);
                count++;
            }
            pow = pow.add(new BigDecimal("1"));
        }while (count < 10);
    }
}
