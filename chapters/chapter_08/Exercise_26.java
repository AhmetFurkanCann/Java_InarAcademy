package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        getInputForMatrix(matrix);
        double[][] result = sortRows(matrix);
        displayMatrix(result);
    }

    public static double[][] sortRows(double[][] matrix) {
        double[][] result = new double[matrix.length][matrix[0].length] ;
        copyMatrixToResult(result , matrix);
        for (int z = 0; z < result.length; z++) {
            for (int i = 0; i < result.length - 1; i++) {
                double currentMin = result[z][i];
                int currentMinIndex = i;

                for (int j = i + 1; j < result.length; j++) {
                    if (currentMin > result[z][j]) {
                        currentMin = result[z][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    double temp = result[z][i];
                    result[z][i] = result[z][currentMinIndex];
                    result[z][currentMinIndex] = temp;
                }
            }
        }
        return result;
    }

    public static void copyMatrixToResult(double[][] result, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }
    }

    public static void getInputForMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
    }

    public static void displayMatrix(double[][] matrix) {
        System.out.println("The row-sorted array is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
