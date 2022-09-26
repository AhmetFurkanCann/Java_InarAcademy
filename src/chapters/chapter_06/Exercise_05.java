package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter first number : ");
        double number1 = input.nextDouble();
        System.out.println("Enter second number : ");
        double number2 = input.nextDouble();
        System.out.println("Enter third number : ");
        double number3 = input.nextDouble();
        displaySortedNumbers(number1, number2, number3) ;




    }

    public static void displaySortedNumbers(double number1, double number2, double number3) {
        System.out.print("Numbers in increasing order : ");
        if (number1 >= number2 && number1 >= number3 ) {
            if(number2 >= number3) {
                System.out.print(number3 + " " + number2 + " " + number1);
            }
            else {
                System.out.print(number2 + " " + number3 + " " + number1);
            }

        }
        else if (number2 >= number1 && number2 >= number3) {
            if(number1 >= number3) {
                System.out.print(number3 + " " + number1 + " " + number2);
            }
            else {
                System.out.print(number1 + " " + number3 + " " + number2);
            }

        }
        else {
            if(number2 >= number1) {
                System.out.print(number1 + " " + number2 + " " + number3);
            }
            else {
                System.out.print(number2 + " " + number1 + " " + number3);
            }
        }

    }
}
