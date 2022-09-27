package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string : ");
        String s = input.nextLine();
        System.out.println("Number of letters in string " + s + " is : " + countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0 ;
        for (int i = 0; i <  s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count ;
    }
}
