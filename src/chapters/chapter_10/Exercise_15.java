package chapters.chapter_10;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points : ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        Exercise_13MyRectangle2D r = getRectangle(points) ;
        System.out.println("The bounding rectangle's center (" + r.getX() + "," + r.getY() + "), width " + r.getWidth() + " , " + "height " + r.getHeight());
    }

    private static Exercise_13MyRectangle2D getRectangle(double[][] points) {
        double x1 = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < x1) {
                x1 = points[i][0];
            }
        }
        double x2 = points[points.length - 1][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > x2) {
                x2 = points[i][0];
            }
        }
        double x = (x1 + x2) / 2.0 ;
        double width = Math.abs(x2 - x1) ;

        double y1 = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < y1) {
                y1 = points[i][1];
            }
        }
        double y2 = points[points.length - 1][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > y2) {
                y2 = points[i][1];
            }
        }
        double y = (y1 + y2) / 2.0 ;
        double height = Math.abs(y2 - y1) ;
        return new Exercise_13MyRectangle2D(x , y , width , height) ;
    }
}
