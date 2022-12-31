package chapters.chapter_13;

import java.util.Scanner;

public class Exercise_17Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the first complex number : ");
        double number1Real = input.nextDouble();
        double number1Imaginary = input.nextDouble();
        Exercise_17Complex complex1 = new Exercise_17Complex(number1Real , number1Imaginary) ;
        System.out.println("Enter the second complex number : ");
        double number2Real = input.nextDouble();
        double number2Imaginary = input.nextDouble();
        Exercise_17Complex complex2 = new Exercise_17Complex(number2Real, number2Imaginary) ;
        System.out.println(complex1.toString() + " + " + complex2.toString() + " = " + (complex1.add(complex2)).toString());
        System.out.println(complex1.toString() + " - " + complex2.toString() + " = " + (complex1.subtract(complex2)).toString());
        System.out.println(complex1.toString() + " * " + complex2.toString() + " = " + (complex1.multiply(complex2)).toString());
        System.out.println(complex1.toString() + " / " + complex2.toString() + " = " + (complex1.divide(complex2)).toString());
        System.out.println("| " + complex1.toString() + " |  = " + complex1.abs() );
        System.out.println("| " + complex2.toString() + " |  = " + complex2.abs() );

    }
}
