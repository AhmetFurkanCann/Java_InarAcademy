package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        int[][] grid = readSolution();
        System.out.println(isValid(grid)? "Valid solution" : "Invalid solution");
    }

    public static boolean isValid(int[][] grid) {
        return rowControl(grid) && columnControl(grid) && box3by3Control(grid) ;
    }

    public static boolean box3by3Control(int[][] grid) {
        for (int i = 0; i < 9; i += 3) {
            if(!controlBox3by3(i,grid)){
                return false;
            }
        }
        return true ;
    }

    public static boolean controlBox3by3(int i, int[][] grid) {
        for (int j = 0; j < 9; j += 3) {
            boolean[] controlArray = new boolean[9];
            for (int k = i; k < i + 3 ; k++) {
                for (int l = j; l < j + 3; l++) {
                    controlArray[grid[k][l] - 1 ] = true ;
                }
            }
            if (!isThereAnyFalse(controlArray)){
                return false ;
            }
        }
        return true ;
    }

    public static boolean columnControl(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            boolean[] controlArray = new boolean[9];
            for (int j = 0; j < grid.length; j++) {
                controlArray[grid[j][i] - 1 ] = true ;
            }
            if (!isThereAnyFalse(controlArray)){
                return false ;
            }
        }
        return true ;
    }

    public static boolean rowControl(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            boolean[] controlArray = new boolean[9];
            for (int j = 0; j < grid[0].length; j++) {
                controlArray[grid[i][j] - 1 ] = true ;
            }
            if (!isThereAnyFalse(controlArray)){
                return false ;
            }
        }
        return true ;
    }

    public static boolean isThereAnyFalse(boolean[] controlArray) {
        for (int i = 0; i < controlArray.length; i++) {
            if (!controlArray[i]){
                return false ;
            }
        }
        return true ;
    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution :");
        int[][] grid = new int[9][9];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        return grid ;
    }
}
