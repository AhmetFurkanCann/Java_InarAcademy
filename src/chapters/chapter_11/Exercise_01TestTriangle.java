package chapters.chapter_11;

import java.util.Scanner;

public class Exercise_01TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides : ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        System.out.println("Enter a color : ");
        String color = input.next();
        System.out.println("Is the triangle filled (true / false ) ? ");
        boolean filled = input.nextBoolean();
        Exercise_01Triangle triangle = new Exercise_01Triangle(s1,s2,s3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println(triangle.toString());
    }
}
