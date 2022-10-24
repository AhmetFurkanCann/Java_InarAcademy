package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int row = input.nextInt();
        System.out.println("Enter the column : ");
        int column = input.nextInt();
        int[][] m = new int[row][column];
        getMInput(m);
        System.out.println("The array is " + ((isConsecutiveFour(m)) ? "Consecutive" : "not Consecutive"));
    }

    public static boolean isConsecutiveFour(int[][] m) {
        return rowControl(m) || columnControl(m) || diagonalControl(m) || subDiagonalControl(m) ;
    }

    public static boolean subDiagonalControl(int[][] m) {
        for (int i = m.length - 1; i > 2; i--) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if(m[i][j] == m[i - 1][j + 1] && m[i - 1][j + 1] == m[i - 2][j + 2] && m[i - 2][j + 2] == m[i - 3][j + 3]){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static boolean diagonalControl(int[][] m) {
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if(m[i][j] == m[i + 1][j + 1] && m[i + 1][j + 1] == m[i + 2][j + 2] && m[i + 2][j + 2] == m[i + 3][j + 3]){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static boolean columnControl(int[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length - 3; j++) {
                if(m[j][i] == m[j + 1][i] && m[j + 1][i] == m[j + 2][i] && m[j + 2 ][i] == m[j + 3][i]){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static boolean rowControl(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if(m[i][j] == m[i][j + 1] && m[i][j + 1] == m[i][j + 2] && m[i][j + 2] == m[i][j + 3]){
                    return true ;
                }
            }
        }
        return false ;
    }

    public static void getMInput(int[][] m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers :");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }
}
