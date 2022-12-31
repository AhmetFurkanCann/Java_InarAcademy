package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        double[][] points = new double[5][2] ;
        System.out.println("Enter five points : ");
        getPoints(points);
        if(sameLine(points)){
            System.out.println("The five points are on the same line");
        }
        else {
            System.out.println("The five points are not on the same line");
        }
    }

    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length - 3; i++) {
            if (!onTheSameLine(points[i][0] , points[i][1] , points[i +1][0] , points[i + 1][1] ,points[i + 2][0] , points[i + 2][1] )){
                return false ;
            }
        }
        return true ;
    }
    public static boolean onTheSameLine(double p0x, double p0y, double p1x, double p1y, double p2x, double p2y) {
        double condition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        return (condition == 0);
    }

    public static void getPoints(double[][] points) {
        Scanner input = new Scanner(System.in) ;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j]= input.nextDouble();
            }
        }
    }
}
