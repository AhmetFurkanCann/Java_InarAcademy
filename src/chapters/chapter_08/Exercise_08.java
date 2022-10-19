package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        double[][] arraySameDistance = new double[numberOfPoints][2];
        int sameDistance = 0;
        getPoints(points , numberOfPoints);
        findAndDisplayShortestDistance(points , arraySameDistance ,sameDistance) ;

    }

    public static void findAndDisplayShortestDistance(double[][] points, double[][] arraySameDistance, int sameDistance) {
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                if (shortestDistance > distance){
                    p1 = i ;
                    p2 = j ;
                    shortestDistance = distance ;
                    sameDistance = 0;
                }
                if (shortestDistance == distance){
                    arraySameDistance[sameDistance][0]= i ;
                    arraySameDistance[sameDistance][1] = j ;
                    sameDistance++;
                }
            }
        }
        if (sameDistance == 0) {
            System.out.println("The closest two points are " + "(" + points[p1][0] + "," + points[p1][1] + ") and (" + points[p2][0] + "," + points[p2][1] + ")");
        }
        else {
            System.out.println("The closest two points are " + "(" + points[p1][0] + "," + points[p1][1] + ") and (" + points[p2][0] + "," + points[p2][1] + ")");
            for (int i = 0; i < sameDistance; i++) {
                System.out.println("The closest two points are " + "(" + points[(int) arraySameDistance[i][0]][0] + "," + points[(int) arraySameDistance[i][0]][1] + ") and (" + points[(int) arraySameDistance[i][1]][0] + "," + points[(int) arraySameDistance[i][1]][1] + ")");
            }
            System.out.println("Their distance is " + shortestDistance);
        }
    }

    public static void getPoints(double[][] points, int numberOfPoints) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
