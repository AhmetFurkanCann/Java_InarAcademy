package chapters.chapter_12;

import com.sun.xml.internal.stream.Entity;

import java.io.File;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws Exception {
        File file = new File("SortedStrings.txt");
        boolean result = true;
        try (
                Scanner input = new Scanner(file);
        ) {

            String s1 = input.next();
            while (input.hasNext()) {
                String s2 = input.next();
                if (s1.compareTo(s2) > 0) {
                    result = false;
                    System.out.println("Strings are not sorted in the file !");
                    System.out.println(s1 + " " + s2);
                }
                s1 = s2;
            }
        }
        if (result) {
            System.out.println("Strings are sorted in the file");
        }

    }
}
