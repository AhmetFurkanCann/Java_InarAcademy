package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.println("Enter matrix 1 :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Enter matrix 2 :");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        double[][] matrix3 = addMatrix(matrix1, matrix2);
        displayAdding(matrix1, matrix2, matrix3);
    }

    public static void displayAdding(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < matrix1.length; i++) {
            if (i == 1) {
                System.out.println(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "  +  " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "  =  " + matrix3[i][0] + " " +  matrix3[i][1] + " " + matrix3[i][2]);
            }
            else {
                System.out.println(matrix1[i][0] + " " +  matrix1[i][1] + " " + matrix1[i][2] + "     " + matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "     " + matrix3[i][0] + " " + matrix3[i][1] + " " + matrix3[i][2]);
            }
        }
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
