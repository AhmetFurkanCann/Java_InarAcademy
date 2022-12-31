package chapters.chapter_06;

import java.util.Scanner;

import static java.lang.Long.reverse;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        if (isPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }

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
