package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }
        File srcRootDirectory = new File(args[0]);
        ArrayList<File> list = new ArrayList<>(Arrays.asList(srcRootDirectory.listFiles()));
        while (!list.isEmpty()) {
            if (list.get(0).isDirectory()) {
                list.addAll(Arrays.asList(list.get(0).listFiles()));
            } else {
                if (isJavaCode(list.get(0))) {
                    chapterOperations(list.get(0));
                }
                list.remove(0);
            }
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

    private static void chapterOperations(File file) throws FileNotFoundException {
        ArrayList<String> s = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s.add(input.nextLine());
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i < s.size(); i++) {
                output.println(s.get(i));
            }
        }
    }
}
