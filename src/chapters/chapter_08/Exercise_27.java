package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        getInputForMatrix(matrix);
        double[][] result = sortColumns(matrix);
        displayMatrix(result);
    }
    public static double[][] sortColumns(double[][] matrix) {
        double[][] result = new double[matrix.length][matrix[0].length] ;
        copyMatrixToResult(result , matrix);
        for (int z = 0; z < result[0].length; z++) {
            for (int i = 0; i < result[0].length - 1; i++) {
                double currentMin = result[i][z];
                int currentMinIndex = i;

                for (int j = i + 1; j < result[0].length; j++) {
                    if (currentMin > result[j][z]) {
                        currentMin = result[j][z];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    double temp = result[i][z];
                    result[i][z] = result[currentMinIndex][z];
                    result[currentMinIndex][z] = temp;
                }
            }
        }
        return result ;
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
    public static void copyMatrixToResult(double[][] result, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }
    }
    public static void displayMatrix(double[][] matrix) {
        System.out.println("The column-sorted array is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
