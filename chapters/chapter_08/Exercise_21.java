package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        int cities = input.nextInt();
        double[][] coordinates = new double[cities][2];
        getCoordinates(coordinates);
        int minCity = findTheCentralCity(coordinates);
        System.out.println("The central city is at ( " + coordinates[minCity][0] + " , " + coordinates[minCity][1] + " )");
        System.out.printf("The total distance to all other cities is %.2f" , totalDistance(minCity , coordinates));
    }

    public static int findTheCentralCity(double[][] coordinates) {
        double min = Double.MAX_VALUE;
        int minCity = -1 ;
        for (int i = 0; i < coordinates.length; i++) {
            if (totalDistance(i , coordinates) < min){
                min = totalDistance(i , coordinates);
                minCity = i ;
            }
        }
        return minCity ;
    }

    public static double totalDistance(int city , double[][] coordinates ) {
        double result = 0 ;
        for (int i = 0; i < coordinates.length ; i++) {
            result += distance(city , i , coordinates);
        }
        return result;
    }

    public static double distance(int city, int j , double[][] coordinates ) {
        return Math.sqrt(Math.pow((coordinates[j][0] - coordinates[city][0]) , 2) + Math.pow((coordinates[j][1] - coordinates[city][1]) , 2)) ;
    }

    public static void getCoordinates(double[][] coordinates) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of the cities : ");
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = input.nextDouble();
            }
        }
    }
}
