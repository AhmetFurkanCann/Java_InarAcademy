package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_03MyInteger {
    private int value ;
    public Exercise_03MyInteger(int value) {
        this.value = value ;
    }
    public int getValue(){
        return value ;
    }
    public boolean isEven() {
        return isEven(value) ;
    }
    public boolean isOdd() {
        return isOdd(value) ;
    }
    public boolean isPrime() {
        return isPrime(value);
    }
    public static boolean isEven (int value) {
        return (value % 2 == 0);
    }
    public static boolean isOdd (int value) {
        return (value % 2 != 0);
    }
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2 ; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true ;
    }
    public static boolean isEven (Exercise_03MyInteger value) {
        return isEven(value.getValue()) ;
    }
    public static boolean isOdd (Exercise_03MyInteger value) {
        return isOdd(value.getValue()) ;
    }
    public static boolean isPrime(Exercise_03MyInteger value) {
        return isPrime(value.getValue()) ;
    }
    public boolean equals (int value) {
        return this.value == value ;
    }
    public boolean equals (Exercise_03MyInteger value){
        return equals(value.getValue()) ;
    }
    public  static int parseInt (char[] charArray) {
        String s = "" ;
        for (int i = 0; i < charArray.length; i++) {
            s += charArray[i] ;
        }
        return parseInt(s);
    }
    public  static int parseInt (String s) {
        return Integer.parseInt(s);
    }



}
