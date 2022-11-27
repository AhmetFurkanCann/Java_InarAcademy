package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }
        File srcRootDirectory = new File(args[0]);
        if (!srcRootDirectory.isDirectory()) {
            System.out.println("File in not a directory !");
            System.exit(2);
        }
        ArrayList<File> list = new ArrayList<>(Arrays.asList(srcRootDirectory.listFiles()));
        while (!list.isEmpty()) {
            if (list.get(0).isDirectory()) {
                list.addAll(Arrays.asList(list.get(0).listFiles()));
            } else {
                replaceAllOldStringWithNewString(list.get(0) , args);
                list.remove(0);
            }
        }
    }

    private static void replaceAllOldStringWithNewString(File file, String[] args) throws FileNotFoundException {
        ArrayList<String> s = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s.add((input.nextLine()).replaceAll(args[1],args[2]));
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < s.size(); i++) {
                output.println(s.get(i));
            }
        }
    }
}

