package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        getInputForMatrix(matrix);
        System.out.println("It " + ((isMarkovMatrix(matrix)) ? " is " : " is not ") + " a Markov Matrix");
    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        return isEachElementIsPositive(matrix) && isSumOfTheElementsInEachColumnIs1(matrix) ;
    }

    public static boolean isSumOfTheElementsInEachColumnIs1(double[][] matrix) {
        for (int i = 0; i < matrix[0].length ; i++) {
            double total = 0 ;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[j][i];
            }
            if (total != 1){
                return false;
            }
        }
        return true;
    }

    public static boolean isEachElementIsPositive(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < 0){
                    return false;
                }
            }
        }
        return true ;
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
}
