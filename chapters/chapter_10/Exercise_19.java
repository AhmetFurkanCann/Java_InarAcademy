package chapters.chapter_10;

import java.math.BigInteger;

public class Exercise_19 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("2");
        BigInteger a = new BigInteger("2");
        System.out.println("p                      2 ^ p - 1");
        System.out.println("---------------------------------");
        for (int i = 2; i <= 100 ; i++) {
            if (isPrime(i)) {
                for (int j = 1; j < i; j++) {
                    a = a.multiply(new BigInteger("2")) ;
                }
                a = a.subtract(new BigInteger("1")) ;
                System.out.printf("%-23s%-9s" ,(i + "") , a.toString());
                System.out.println();
                a = b ;
            }
        }
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
