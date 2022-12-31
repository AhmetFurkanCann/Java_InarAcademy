package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File name : ");
        String s = input.nextLine();
        File file = new File(s);
        if (!file.exists()) {
            System.out.println("File " + s + " does not exist");
            System.exit(1);
        }
        input = new Scanner(file);
        int count = 0;
        double result = 0 ;
        while (input.hasNext()){
            double number = Double.parseDouble(input.next());
            result += number;
            count++;
        }
        System.out.println("Sum of the numbers in the file : " + result + "\n Average of the numbers in the file : " + (result / count));
    }
}
