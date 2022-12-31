package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java Chapter_12.Exercise_11 filename word");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        String s = "";
        try (
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String line = input.nextLine();
                s += line.replaceAll(args[1],"" ) + "\n";
            }
        }
        try (
                PrintWriter output = new PrintWriter(sourceFile);
        ) {
            output.print(s);
        }
    }
}

