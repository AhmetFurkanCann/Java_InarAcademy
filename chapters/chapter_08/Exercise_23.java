package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        getInputForMatrix(matrix);
        if (rowIndex(matrix) == -1 || columnIndex(matrix) == -1){
            System.out.println("No cell flipped");
        }
        else {
            System.out.println("The flipped cell is at ( " + rowIndex(matrix) + " , " + columnIndex(matrix) + " )");
        }
    }

    public static int columnIndex(int[][] matrix) {
        int index = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if(count % 2 != 0){
                index = i ;
                break;
            }
        }
        return index ;
    }

    public static int rowIndex(int[][] matrix) {
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if(count % 2 != 0){
                index = i ;
                break;
            }
        }
        return index ;
    }

    public static void getInputForMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
