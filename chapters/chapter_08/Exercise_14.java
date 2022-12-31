package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix : ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        getAndDisplayRandomMatrix(matrix);
        rowControl(matrix);
        columnControl(matrix);
        majorDiagonalControl(matrix);
        subDiagonalControl(matrix);
    }

    public static void subDiagonalControl(int[][] matrix) {
        boolean result = true ;
        for (int i = matrix.length - 1 , j = 0 ;  i > 0 ; i-- , j++) {
            if (matrix[i][j] != matrix[i-1] [j + 1]){
                result = false;
            }
        }
        if (result){
            System.out.println("All " + matrix[matrix.length - 1][0] + " 's on sub diagonal ");
        }
        else {
            System.out.println("No same numbers on the sub diagonal");
        }
    }

    public static void majorDiagonalControl(int[][] matrix) {
        boolean result = true ;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][i] != matrix[i + 1][i + 1]){
                result = false;
            }
        }
        if (result){
            System.out.println("All " + matrix[0][0] + " 's on major diagonal ");
        }
        else {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void columnControl(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean result = true ;
            for (int j = 0; j < matrix.length - 1 ; j++) {
                if(matrix[j][i] != matrix[j + 1][i]){
                    result = false;
                }
            }
            if (result){
                System.out.println("All " + matrix[i][0] + " s on column " + i);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No same numbers on a column");
        }
    }

    public static void rowControl(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean result = true ;
            for (int j = 0; j < matrix.length - 1 ; j++) {
                if(matrix[i][j] != matrix[i][j + 1]){
                    result = false;
                }
            }
            if (result){
                System.out.println("All " + matrix[i][0] + " s on row " + i);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No same numbers on a row");
        }
    }

    public static void getAndDisplayRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2) ;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
