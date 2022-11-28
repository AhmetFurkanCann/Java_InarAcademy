package chapters.chapter_12;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("There is no file in the directory !");
            System.exit(1);
        }
        ArrayList<File> list = new ArrayList<>();
        // Add files in a list
        for (int i = 0; i < args.length; i++) {
            list.add(new File(args[i]));
        }

        while (!list.isEmpty()) {
            if (list.get(0).isDirectory()) {
                list.addAll(Arrays.asList(list.get(0).listFiles()));
            } else {
                addingZeroBeforeIandJ(list.get(0));
                list.remove(0);
            }
        }

    }

    private static void addingZeroBeforeIandJ(File file) throws FileNotFoundException {
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
            stringOperations(s);
            for (int i = 0; i < s.size(); i++) {
                output.println(s.get(i));
            }
        }
    }

    private static void stringOperations(ArrayList<String> s) {
        for (int i = 0; i < s.size(); i++) {
            if ((s.get(i)).matches("Exercise\\d_\\d")){
                String newString = "";
                for (int j = 0; j < s.get(i).length(); j++) {
                    if (j == 8) {
                        newString += "0" + (s.get(i)).charAt(j);
                    } else if (j == 10) {
                        newString += "0" + (s.get(i)).charAt(j);
                    }
                    else {
                        newString += (s.get(i)).charAt(j);
                    }
                    s.set(i,newString);
                }
            }
            else if ((s.get(i)).matches("Exercise\\d_\\d+")){
                String newString = "";
                for (int j = 0; j < s.get(i).length(); j++) {
                    if (j == 8) {
                        newString += "0" + (s.get(i)).charAt(j);
                    }
                    else {
                        newString += (s.get(i)).charAt(j);
                    }
                    s.set(i,newString);
                }
            }
            else if ((s.get(i)).matches("Exercise\\d+_\\d")){
                String newString = "";
                for (int j = 0; j < s.get(i).length(); j++) {
                    if (j == s.get(i).length() - 1) {
                        newString += "0" + (s.get(i)).charAt(j);
                    }
                    else {
                        newString += (s.get(i)).charAt(j);
                    }
                    s.set(i,newString);
                }
            }
        }
    }
}
