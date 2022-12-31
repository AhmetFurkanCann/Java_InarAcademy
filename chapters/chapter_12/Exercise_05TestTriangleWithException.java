package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_05TestTriangleWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        try {
            Exercise_05TriangleWithException triangle = new Exercise_05TriangleWithException(side1, side2, side3);
            System.out.println("Area of the triangle is " + triangle.getArea());
        }catch (Exercise_05IllegalTriangleException exception){
            System.out.println(exception.getMessage());
        }
    }
}
