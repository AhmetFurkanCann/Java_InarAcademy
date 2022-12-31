package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        ArrayList<Integer> results = new ArrayList<>() ;
        int number1 = (int) (Math.random() * 10 ) ;
        int number2 = (int) (Math.random() * 10 ) ;
        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();
        while (number1 + number2 != answer){
            if (results.contains(answer)){
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. " + "What is " + number1 + " + " + number2 + " ? ");
            }
            else {
                System.out.print("Wrong answer. Try again." + "What is " + number1 + " + " + number2 + " ? ");
                results.add(new Integer(answer)) ;
            }
            answer = input.nextInt();
        }
        System.out.println("You got it ! ");
    }
}
