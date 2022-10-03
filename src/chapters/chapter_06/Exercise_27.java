package chapters.chapter_06;

public class Exercise_27 {
    public static void main(String[] args) {
        int count = 1 ;
        int number = 10 ;
        while (count < 101) {
            if(isPrime(number) ){
                String s = number + "";
                int reverse = getReverse(s);
                if(isPrime(reverse) && !isPalindrome(number)){
                    System.out.print(number + " ");
                    if(count % 10 == 0){
                        System.out.println();
                    }
                    count++;
                }
            }
            number++;
        }
    }

    public static int getReverse(String s) {
        String number = "";
        for (int i = s.length() -1; i >= 0 ; i--) {
            number += s.charAt(i);
        }
        return Integer.parseInt(number) ;
    }


    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int reverse(int number) {
        String s = number + "" ;
        String result = "" ;
        for (int i = s.length() - 1 ; i >= 0 ; i-- ){
            result += s.charAt(i) ;
        }
        return Integer.parseInt(result);
    }
}
