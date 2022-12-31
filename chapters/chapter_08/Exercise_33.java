package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1 , y1 , x2 , y2 , x3 , y3 , x4 , y4 :");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] result = getArea(points);
        System.out.println("The areas are " + result[3] + " , " + result[2] + " , " + result[1] + " , " + result[0]);
    }

    public static double[] getArea(double[][] points) {
        double[] a = new double[4] ;
        double[] middlePoint = getMiddlePoint(points) ;
        a[0] = getTriangleArea(points[3][0] , points[3][1] , points[2][0] , points[2][1] , middlePoint[0] , middlePoint[1]);
        a[1] = getTriangleArea(points[2][0] , points[2][1] , points[1][0] , points[1][1] , middlePoint[0] , middlePoint[1]);
        a[2] = getTriangleArea(points[3][0] , points[3][1] , points[0][0] , points[0][1] , middlePoint[0] , middlePoint[1]);
        a[3] = getTriangleArea(points[0][0] , points[0][1] , points[1][0] , points[1][1] , middlePoint[0] , middlePoint[1]);
        double max = a[0] ;
        int count = 0 ;
        int index = 0 ;
        double[] result = new double[4] ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(max < a[j]) {
                    max = a[j] ;
                    index = j ;
                }
            }
            result[count] = max ;
            count++;
            a[index] = 0 ;
            max = 0;
        }
        return result ;
    }

    public static double[] getMiddlePoint(double[][] points) {
        double[] result = new double[2];
        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double c = (points[1][1] - points[3][1]);
        double d = -(points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];
        double ab_bc = a * d - b * c;
        if (ab_bc == 0){
            return null;
        }else {
            double[] point = new double[2];
            result[0] = (e * d - b * f) / ab_bc;
            result[1] = (a * f - e * c) / ab_bc;
        }
        return result;
    }

    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double s1 = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2)) ;
        double s2 = Math.sqrt(Math.pow((x3 - x2) , 2) + Math.pow((y3 - y2) , 2)) ;
        double s3 = Math.sqrt(Math.pow((x3 - x1) , 2) + Math.pow((y3 - y1) , 2)) ;
        double s = (s3 + s2 + s1) / 2 ;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)) ;

        return (area < 0.1) ? 0 : area ;
    }
}
