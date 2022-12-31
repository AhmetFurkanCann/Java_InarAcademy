package chapters.chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isContinue = true ;
        do {
            try {
                System.out.print("Enter an integer1 : ");
                int number1 = input.nextInt();
                System.out.print("Enter an integer2 : ");
                int number2 = input.nextInt();
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                isContinue = false ;
            }catch (InputMismatchException inputEx){
                System.out.println("Incorrect Input Two Integer is required.  Try Again ! ");
                input.nextLine(); // Discard input
            }
        }while (isContinue);
    }
}
