package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double[][] points = new double[3][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double result = getTriangleArea(points) ;
        if (result == 0) {
            System.out.println("The three points are on the same line ");
        }
        else {
            System.out.println("The area of the triangle is : " + result);
        }
    }

    public static double getTriangleArea(double[][] points) {
        double s1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]) , 2) + Math.pow((points[1][1] - points[0][1]) , 2)) ;
        double s2 = Math.sqrt(Math.pow((points[2][0] - points[1][0]) , 2) + Math.pow((points[2][1] - points[1][1]) , 2)) ;
        double s3 = Math.sqrt(Math.pow((points[2][0] - points[0][0]) , 2) + Math.pow((points[2][1] - points[0][1]) , 2)) ;
        double s = (s3 + s2 + s1) / 2 ;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)) ;

        return (area < 0.1) ? 0 : area ;
    }
}
