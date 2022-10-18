package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        getMatrix(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum ;
    }

    public static void getMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= input.nextDouble();
            }
        }
    }
}
