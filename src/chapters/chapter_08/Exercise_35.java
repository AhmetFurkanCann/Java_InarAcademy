package chapters.chapter_08;

import java.util.Scanner;
// NOT FINISHED !!!!!!!!
// NOT FINISHED !!!!!!!!
// NOT FINISHED !!!!!!!!// NOT FINISHED !!!!!!!!
// NOT FINISHED !!!!!!!!// NOT FINISHED !!!!!!!!// NOT FINISHED !!!!!!!!

public class Exercise_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix : ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        getTheMatrix(matrix);
        displayMaximumSquareSubmatrix(matrix);
    }

    public static void displayMaximumSquareSubmatrix(int[][] matrix) {
        int maxSize = 0 ;
        int indexX = -1 ;
        int indexY = -1;
        for (int i = 0; i < matrix.length; i++) {
            int size = 0;
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] == 1 && matrix[i][j] == matrix[i][j + 1]){
                    size++;
                    if (j == matrix[0].length - 2){
                        if(size > maxSize){
                            boolean isPossible = control(size , i , j , matrix) ;
                            if (isPossible) {
                                maxSize = size;
                                indexX = i;
                                indexY = j;
                            }
                        }
                    }
                }
                else {
                    if(size > maxSize){
                        boolean isPossible = control(size , i , j , matrix) ;
                        if (isPossible) {
                            maxSize = size;
                            indexX = i;
                            indexY = j;
                        }
                    }
                }
            }
        }
        System.out.println("The maximum square submatrix is at ( " + indexX + " , " + indexY + " ) with size " + maxSize);
    }

    public static boolean control(int size, int i, int j, int[][] matrix) {
        for (int k = i + 1; k < i + size ; k++) {
            for (int l = j - size; l < j - 1 ; l++) {
                if(!(matrix[k][l] == 1 && matrix[k][l] == matrix[k][l + 1])){
                    return false ;
                }
            }
        }
        return true ;
    }

    public static void getTheMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
