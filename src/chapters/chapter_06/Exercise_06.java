package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter n :");
        int n = input.nextInt();
        displayPattern(n) ;

    }

    public static void displayPattern(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = n-1 ; j >= i ; j--) {
                System.out.print("    ");
            }
            for (int k = i ; k >= 1 ;k--) {
                System.out.printf("%4d" , k);
            }
            System.out.println();
        }
    }
}
