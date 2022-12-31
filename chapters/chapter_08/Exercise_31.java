package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1 , y1 , x2 , y2 , x3 , y3 , x4 , y4  :");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        if (getIntersectingPoint(points) == null) {
            System.out.println("Two lines are parallel");
        } else {
            double[] result = getIntersectingPoint(points);
            System.out.println("Intersecting point is : x = " + result[0] + " y = " + result[1]);
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = new double[2][2];
        double[] b = new double[2];
        a[0][0] = points[0][1] - points[1][1];
        a[0][1] = -1 * (points[0][0] - points[1][0]);
        a[1][0] = points[2][1] - points[3][1];
        a[1][1] = -1 * (points[2][0] - points[3][0]);
        b[0] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        b[1] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        return Exercise_30.linearEquation(a, b);
    }
}
