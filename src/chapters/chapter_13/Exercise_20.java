package chapters.chapter_13;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("The equation has two roots " + ((-b + Math.pow(discriminant, 0.5)) / 2 * a) + " and "
                    + ((-b - Math.pow(discriminant, 0.5)) / 2 * a));
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + ((-b + Math.pow(discriminant, 0.5)) / 2 * a));
        } else {
            Exercise_17Complex root1 = new Exercise_17Complex(-b / (2 * a) , Math.sqrt(discriminant * -1) / (2 * a)) ;
            Exercise_17Complex root2 = new Exercise_17Complex(-b / (2 * a) , Math.sqrt(discriminant * -1) / (2 * a)) ;
            System.out.println("First root : " + root1.toString() );
            System.out.println("Second root : " + root2.toString() );
        }
    }
}
