package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 source-code file");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source-code file " + args[0] + " does not exist");
            System.exit(2);
        }
        if (isJavaCode(sourceFile)) {
            convertTheFileIntoNextLineBraceStyle(sourceFile);
        } else {
            System.out.println("Source-code file is not a java source code file!");
            System.exit(3);
        }
    }

    private static boolean isJavaCode(File file) {
        String fullName = file.getName();
        int index = fullName.lastIndexOf(".");
        if ((fullName.substring(index).equals("java"))) {
            return true;
        } else {
            return false;
        }
    }

    private static void convertTheFileIntoNextLineBraceStyle(File sourceFile) throws FileNotFoundException {
        ArrayList<String> s = new ArrayList<>();
        try (
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                s.add(input.nextLine());
            }
        }

        fixTheBraces(s);

        try (
                PrintWriter output = new PrintWriter(sourceFile);
        ) {
            for (int i = 0; i < s.size(); i++) {
                output.println(s.get(i));
            }
        }
    }

    private static void fixTheBraces(ArrayList<String> s) {
        for (int i = 0; i < s.size(); i++) {
            if ((s.get(i).trim()).equals("{")) {
                String line = s.get(i - 1) + " { ";
                s.set((i - 1), line);
                s.remove(i);
            }
        }
    }
}
