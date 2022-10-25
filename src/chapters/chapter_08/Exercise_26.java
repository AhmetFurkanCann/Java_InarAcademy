package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        getInputForMatrix(matrix);
        sortRows(matrix);
        displayMatrix(matrix);
    }

    public static void sortRows(double[][] matrix) {
        for (int z = 0; z < matrix.length; z++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                double currentMin = matrix[z][i];
                int currentMinIndex = i;

                for (int j = i + 1; j < matrix.length; j++) {
                    if (currentMin > matrix[z][j]) {
                        currentMin = matrix[z][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    double temp = matrix[z][i];
                    matrix[z][i] = matrix[z][currentMinIndex];
                    matrix[z][currentMinIndex] = temp;
                }
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
