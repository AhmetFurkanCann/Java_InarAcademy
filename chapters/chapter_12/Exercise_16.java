package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Exercise12_16 file oldString newString");
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
                s += line.replaceAll(args[1],args[2] ) + "\n";
            }
        }
        try (
                PrintWriter output = new PrintWriter(sourceFile);
        ) {
            output.print(s);
        }
    }
}
