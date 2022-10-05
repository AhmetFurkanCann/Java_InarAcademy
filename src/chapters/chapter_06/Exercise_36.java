package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides:");
        double numberOfSide = input.nextDouble();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the polygon is " + area(numberOfSide , side));
    }

    public static double area(double numberOfSide, double side) {
        return (numberOfSide * Math.pow(side , 2)) / (4 * Math.tan(Math.PI / numberOfSide)) ;
    }
}
