package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a string : ");
        String s = input.nextLine();
        s = s.toUpperCase();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)){
                result += getNumber(ch) ;
            }
            else {
                result += ch ;
            }
            
        }
        System.out.println(result);
    }

    public static int getNumber(char ch) {
        if (ch >= 'A' && ch <= 'C')
           return 2 ;
        else if (ch >= 'D' && ch <= 'F')
            return 3 ;
        else if (ch >= 'G' && ch <= 'I')
            return 4 ;
        else if (ch >= 'J' && ch <= 'L')
            return 5 ;
        else if (ch >= 'M' && ch <= 'O')
            return 6 ;
        else if (ch >= 'P' && ch <= 'S')
            return 7 ;
        else if (ch >= 'T' && ch <= 'V')
            return 8 ;
        else
            return 9 ;
    }
}
