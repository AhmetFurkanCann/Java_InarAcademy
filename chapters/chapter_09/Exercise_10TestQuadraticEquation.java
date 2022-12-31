package chapters.chapter_09;

import java.util.Scanner;

public class Exercise_10TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a , b , c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        Exercise_10QuadraticEquation equation = new Exercise_10QuadraticEquation(a,b,c);
        double discriminant = equation.getDiscriminant();
        System.out.println("The discriminant = " + discriminant);
        if (discriminant > 0) {
            System.out.println("Root 1 = " + equation.getRoot1() + " Root 2 = " + equation.getRoot2());
        }
        else if (discriminant == 0) {
            System.out.println("One root is " + equation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
