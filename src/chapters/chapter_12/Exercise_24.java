package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("File Salary.txt has already existed !!");
            System.exit(1);
        }
        fillTheFile(file);
    }

    private static void fillTheFile(File file) throws FileNotFoundException {
        String[] ranks = {"assistant" , "associate" , "full"} ;
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 1; i < 1001; i++) {
                int rank = (int) (Math.random() * ranks.length);
                double salary = 0;
                switch (rank){
                    case 0 : salary = Math.random() * 30001 + 50000 ;break;
                    case 1 : salary = Math.random() * 50001 + 60000 ;break;
                    case 2 : salary = Math.random() * 55001 + 75000 ;
                }
                output.printf("FirstName%d LastName%d %s %.2f" ,i ,i ,ranks[rank] ,salary);
                output.println();
            }
        }
    }
}
