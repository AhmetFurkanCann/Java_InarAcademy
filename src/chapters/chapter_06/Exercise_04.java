package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number) {
        String s = number + "" ;
        String result = "" ;
        for (int i = s.length() - 1 ; i >= 0 ; i-- ){
            result += s.charAt(i) ;
        }
        System.out.println("Reversal of " + number + " is : " + result);
    }
}
