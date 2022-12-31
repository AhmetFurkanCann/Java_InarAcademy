package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_06 {
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
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        displayMultiplying(matrix1, matrix2, matrix3);
    }

    public static void displayMultiplying(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        System.out.println("The multiplication of the matrices is");
        for (int i = 0; i < matrix1.length; i++) {
            if (i == 1) {
                System.out.printf("%.2f %.2f %.2f  *  %.2f %.2f %.2f  =  %.2f %.2f %.2f" ,matrix1[i][0] , matrix1[i][1] , matrix1[i][2] ,  matrix2[i][0] , matrix2[i][1] , matrix2[i][2]  , matrix3[i][0] ,  matrix3[i][1] , matrix3[i][2]);
                System.out.println();
            }
            else {
                System.out.printf("%.2f %.2f %.2f  *  %.2f %.2f %.2f     %.2f %.2f %.2f" ,matrix1[i][0] , matrix1[i][1] , matrix1[i][2] ,  matrix2[i][0] , matrix2[i][1] , matrix2[i][2]  , matrix3[i][0] ,  matrix3[i][1] , matrix3[i][2]);
                System.out.println();
            }
        }
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                result[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j]) +
                        (matrix1[i][2] * matrix2[2][j]) ;
            }
        }
        return result ;
    }
}
