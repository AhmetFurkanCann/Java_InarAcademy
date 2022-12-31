package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name :");
        String fileName = input.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        int[] letters = countTheLetter(file);
        displayTheResult(letters);

    }

    private static void displayTheResult(int[] letters) {
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Number of " + ch + "'s : " + letters[i]);
            ch++;
        }
    }

    private static int[] countTheLetter(File file) throws FileNotFoundException {
        int[] letters = new int[26];
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s = input.next();
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isLetter(s.charAt(i))) {
                        int index = Character.toUpperCase(s.charAt(i)) - 'A';
                        letters[index]++;
                    }
                }
            }
        }
        return letters;
    }
}
