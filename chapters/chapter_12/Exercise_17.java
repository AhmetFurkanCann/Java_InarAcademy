package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) throws FileNotFoundException {
        char guessAnotherWord ;
        ArrayList<String> words = new ArrayList<>();
        File sourceFile = new File("hangman.txt");
        try (
                Scanner fileWords = new Scanner(sourceFile);
        ) {
            while (fileWords.hasNext()) {
                words.add(fileWords.next());
            }
        }
        do {
            String word = words.get((int) (Math.random() * words.size()));
            oneWordGuess(word);
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to guess another word? Enter y or n > ");
            guessAnotherWord = Character.toLowerCase(input.nextLine().charAt(0));
        } while (guessAnotherWord == 'y') ;
    }

    public static void oneWordGuess(String word) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int miss = 0 ;
        char[] asterix = new char[word.length()];
        fillTheAsterix(asterix , word);

        do {
            System.out.print("(Guess) Enter a letter in word " + displayAsterix(asterix) + " > " ) ;
            char guess = input.nextLine().charAt(0);
            System.out.println(guess);
            if(!word.contains(guess + "")){
                System.out.println(guess + " is not in the word");
                miss++;
                continue;
            }
            if (isAlreadyInTheWord(asterix , guess)){
                System.out.println(guess + " is already in the word");
                continue;
            }

            for (int i = 0; i < word.length(); i++) {
                if (guess == word.charAt(i)) {
                    asterix[i] = guess;
                    count++;

                }
            }
        }while (count < word.length()) ;
        System.out.println("The word is " + word + " You missed " + miss + " time");
    }

    public static String displayAsterix(char[] asterix) {
        String s = "" ;
        for (int i = 0; i < asterix.length; i++) {
            s += asterix[i] + "" ;
        }
        return s ;
    }

    public static boolean isAlreadyInTheWord(char[] asterix, char guess) {
        for (int i = 0; i < asterix.length; i++) {
            if (asterix[i] == guess){
                return true ;
            }
        }
        return false;
    }

    public static void fillTheAsterix(char[] asterix , String word) {
        for (int i = 0; i < word.length(); i++) {
            asterix[i] = '*';
        }
    }
}
