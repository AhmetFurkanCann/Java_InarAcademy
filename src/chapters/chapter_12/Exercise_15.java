package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        File file = new File("Exercise12_15.txt");
        if (!file.exists()) {
            System.out.println("File Exercise12_15.txt does not exist !!");
            System.exit(1);
        }
        fillTheFileWithRandomNumbers(file);
        sortTheNumbers(list ,file);
        displaySortedNumbers(list);
    }

    private static void displaySortedNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void sortTheNumbers(ArrayList<Integer> list , File file) throws Exception {
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()){
                list.add(input.nextInt());
            }
        }
        java.util.Collections.sort(list);
    }

    private static void fillTheFileWithRandomNumbers(File file) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 100) + " ");
            }
        }
    }
}
