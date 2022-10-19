package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_35 {
    public static void main(String[] args) {
        String[] words = {"write", "that", "pool" , "dog" , "abruptly" , "nightclub" , "unknown" , "cycle" , "quiz",
        "wheezy" , "lengths" , "funny"};
        Scanner input = new Scanner(System.in);
        String word = words[(int) Math.random() * words.length];
        String asterix = "" ;
        for (int i = 0; i < words.length; i++) {
            asterix += "*" ;
        }
        System.out.print("(Guess) Enter a letter in word " + asterix + " >");
        char letter = input.nextLine().charAt(0);
        for (int i = 0; i < words.length; i++) {
            if(letter == word.charAt(i)){

            }
        }
        // NOT FINISHED !!
    }
}
