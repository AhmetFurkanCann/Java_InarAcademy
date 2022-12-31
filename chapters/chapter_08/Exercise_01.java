package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        getMatrix(matrix);
        sumMatrix(matrix);

    }

    public static void sumMatrix(double[][] matrix) {
        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.println("Sum of the element at column " + i + " is " + sumColumn(matrix , i));
        }
    }

    public static void getMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= input.nextDouble();
            }
        }
    }
    public static double sumColumn(double[][] m, int columnIndex) {
            double sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][columnIndex] ;
            }
            return sum;
    }
}
