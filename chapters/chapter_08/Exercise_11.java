package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        String[] possibilities = new String[512];
        fillTheArrayWithPossibilities(possibilities) ;
        System.out.println("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        displayResult(possibilities[number]);
    }

    public static void displayResult(String s) {
        for (int i = 0; i < s.length(); i++) {
            if( i % 3 == 0){
                System.out.println();
            }
            System.out.print((s.charAt(i) == '0' ) ? "H " : "T ");
        }
    }

    public static void fillTheArrayWithPossibilities(String[] possibilities) {
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            for (int n = 0; n < 2; n++) {
                                for (int o = 0; o < 2; o++) {
                                    for (int p = 0; p < 2; p++) {
                                        for (int q = 0; q < 2; q++) {
                                            possibilities[count] = i + "" + j + "" + k + "" + l + "" + m + "" + n + "" + o + "" + p + "" + q;
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}