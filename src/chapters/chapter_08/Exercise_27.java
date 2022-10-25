package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        getInputForMatrix(matrix);
        sortColumns(matrix);
        displayMatrix(matrix);
    }
    public static void sortColumns(double[][] matrix) {
        for (int z = 0; z < matrix[0].length; z++) {
            for (int i = 0; i < matrix[0].length - 1; i++) {
                double currentMin = matrix[i][z];
                int currentMinIndex = i;

                for (int j = i + 1; j < matrix[0].length; j++) {
                    if (currentMin > matrix[j][z]) {
                        currentMin = matrix[j][z];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex != i) {
                    double temp = matrix[i][z];
                    matrix[i][z] = matrix[currentMinIndex][z];
                    matrix[currentMinIndex][z] = temp;
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
        System.out.println("The column-sorted array is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
