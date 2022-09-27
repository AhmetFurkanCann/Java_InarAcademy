package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Three Side Of Triangle : ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        if(isValid(s1 , s2 , s3)) {
            System.out.println("The area of the triangle is : " + area( s1 , s2 , s3));
        }
        else {
            System.out.println("Input is invalid");
        }

    }

    public static double area(double s1, double s2, double s3) {
        double s = (s1 + s2 + s3) / 2 ;
        return Math.pow(s *(s - s1) * (s - s2) * (s - s3) , 0.5);

    }

    public static boolean isValid(double s1, double s2, double s3) {
        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            return true;
        }
        else {
            return false;
        }
    }
}
