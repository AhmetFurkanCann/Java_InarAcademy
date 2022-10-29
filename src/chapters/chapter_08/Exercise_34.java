package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[6][2];
        System.out.println("Enter 6 points : ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j]= input.nextDouble();
            }
        }
        double[] result = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is ( " + result[0] + " , " + result[1] + " )");
    }
    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] result = new double[2];
        int index = 0 ;
        double min = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (min > points[i][1]){
                index = i ;
                min = points[i][1];
            }else if(min == points[i][1]){
                if(points[i][0] > points[index][0]){
                    index = i ;
                }
            }
        }
        result[0] = points[index][0] ;
        result[1] = points[index][1] ;
        return result ;
    }
}
