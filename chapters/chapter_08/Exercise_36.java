package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = input.nextInt();
        char[][] letters = new char[n][n];
        System.out.println("Enter " + n + " rows of letters seperated by spaces : ") ;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                String s = input.next();
                char ch = s.charAt(0);
                if (ch >= 65 && ch < (char)(65 + letters.length))
                    letters[i][j] = ch;
                else {
                    System.out.println("Wrong input: the letters must be from A to "
                            + (char)(65 + letters.length - 1));
                    System.exit(1);
                }
            }
        }

        if(control(letters)){
            System.out.println("The input array is a Latin square");
        }
        else {
            System.out.println("The input array is not a Latin square");
        }
    }

    public static boolean control(char[][] letters) {
        return rowControl(letters) && columnControl(letters) ;
    }

    public static boolean columnControl(char[][] letters) {
        for (int i = 0; i < letters[0].length; i++) {
            boolean[] controlArray = new boolean[letters.length];
            for (int j = 0; j < letters.length; j++) {
                controlArray[((char) (letters[i][j])) - 65] = true ;
            }
            if (!isThereAnyFalse(controlArray)){
                return false ;
            }
        }
        return true ;
    }

    public static boolean rowControl(char[][] letters) {
        for (int i = 0; i < letters.length; i++) {
            boolean[] controlArray = new boolean[letters.length];
            for (int j = 0; j < letters[0].length; j++) {
                controlArray[ ((char) (letters[i][j])) - 65 ] = true ;
            }
            if (!isThereAnyFalse(controlArray)){
                return false ;
            }
        }
        return true ;
    }

    public static boolean isThereAnyFalse(boolean[] controlArray) {
        for (int i = 0; i < controlArray.length; i++) {
            if (!controlArray[i]){
                return false ;
            }
        }
        return true ;
    }
}
