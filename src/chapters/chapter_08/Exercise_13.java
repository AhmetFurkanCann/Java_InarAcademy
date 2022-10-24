package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix = new double[row][column];
        getMatrix(matrix);
        int [] result = locateLargest(matrix);
        System.out.println("The location of the largest element is at ( " + result[0] + " , " + result[1] + " )");
    }

    public static int[] locateLargest(double[][] matrix) {
        int[] result = new int[2];
        double max = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] > max ){
                    max = matrix[i][j] ;
                    result[0] = i ;
                    result[1] = j ;
                }
            }
        }
        return result ;
    }

    public static void getMatrix(double[][] matrix) {
        System.out.println("Enter the array: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= input.nextDouble();
            }
        }
    }
}
