package chapters.ArrayListQuestions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_20_01 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage : sourceFile");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        ArrayList<String> words = getInput(sourceFile);
        Collections.sort(words);
        displayWords(words);
    }

    private static void displayWords(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");
        }
    }

    private static ArrayList<String> getInput(File sourceFile) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        try (
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String s = input.next();
                if (Character.isLetter(s.charAt(0))) {
                    words.add(s);
                }
            }
        }
        return words;
    }
}
