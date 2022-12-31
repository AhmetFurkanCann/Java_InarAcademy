package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter String :");
        String s = input.nextLine();
        System.out.println("Enter character : ");
        char ch = input.nextLine().charAt(0);
        System.out.println("Number of occurrences char " + ch + " in a string " + s + " is : " + count(s , ch));
    }
    public static int count(String s, char ch) {
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count ;
    }
}
