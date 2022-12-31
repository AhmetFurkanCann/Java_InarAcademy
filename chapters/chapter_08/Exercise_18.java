package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before shuffle :");
        displayArray(m);
        shuffle(m);
        System.out.println("After shuffle :");
        displayArray(m) ;
    }

    public static void displayArray(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int x = (int) (Math.random() * m.length) ;
            for (int j = 0; j < m[0].length; j++) {
                int temp = m[i][j] ;
                m[i][j] = m[x][j] ;
                m[x][j] = temp ;
            }
        }
    }
}
