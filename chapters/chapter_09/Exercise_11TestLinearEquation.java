package chapters.chapter_09;

import java.util.Scanner;

public class Exercise_11TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b , c , d , e , f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        Exercise_11LinearEquation x = new Exercise_11LinearEquation(a, b, c, d, e, f);
        if (x.isSolvable()){
            System.out.println("X = " + x.getX() + " Y = " + x.getY());
        }else {
            System.out.println("The equation has no solution");
        }
    }
}
