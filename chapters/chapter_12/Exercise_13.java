package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) throws Exception{

        if (args.length != 1) {
            System.out.println("Usage: java Chapter_12.Exercise_13 filename");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        System.out.println("File " + args[0] + " has " + getCharacter(sourceFile) + " characters " + getWords(sourceFile) + " words " + getLines(sourceFile) + " lines ");
    }

    private static int getLines(File sourceFile) throws Exception{
        Scanner input = new Scanner(sourceFile);
        int lines = 0 ;
        while (input.hasNext()){
            String s = input.nextLine();
            lines++;
        }
        return lines ;
    }

    private static int getWords(File sourceFile) throws Exception {
        Scanner input = new Scanner(sourceFile);
        int words = 0 ;
        while (input.hasNext()){
            String s = input.next();
            words++;
        }
        return words ;
    }

    private static int getCharacter (File sourceFile) throws Exception {
        Scanner input = new Scanner(sourceFile);
        String result = "" ;
        while (input.hasNext()){
            String s = input.nextLine();
            result += s ;
        }
        return result.length();
    }
}
