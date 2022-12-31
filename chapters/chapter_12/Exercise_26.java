package chapters.chapter_12;

import java.io.File;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory name");
        String directoryName = input.nextLine();
        File file = new File(directoryName);
        if (file.exists()){
            System.out.println("Directory is already exist");
            System.exit(1);
        }
        if (file.mkdir()){
            System.out.println("Directory is created successfully");
        }
        else {
            System.out.println("Directory is not created due to a problem !");
        }
    }
}
