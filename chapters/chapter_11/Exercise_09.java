package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n : ");
        int n = input.nextInt() ;
        int[][] array = new int[n][n];
        fillTheArray(array);
        printMatrix(array);
        System.out.println("The largest row index: ");
        maxRow(array) ;
        System.out.println("The largest column index: ");
        maxColumn(array) ;
    }
    private static void maxColumn(int[][] array) {
        ArrayList<Integer> maxColumn = new ArrayList<>();
        int max = -1 ;
        for (int i = 0; i < array[0].length; i++) {
            int count = 0 ;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1){
                    count++;
                }
            }
            if (count > max){
                maxColumn.clear();
                maxColumn.add(new Integer(i));
                max = count;
            } else if (count == max) {
                maxColumn.add(new Integer(i)) ;
            }
        }
        for (int i = 0; i < maxColumn.size(); i++) {
            System.out.print(maxColumn.get(i) + " ");
        }
        System.out.println();
    }

    private static void maxRow(int[][] array) {
        ArrayList<Integer> maxRow = new ArrayList<>();
        int max = -1 ;
        for (int i = 0; i < array.length; i++) {
            int count = 0 ;
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1){
                    count++;
                }
            }
            if (count > max){
                maxRow.clear();
                maxRow.add(new Integer(i));
                max = count;
            } else if (count == max) {
                maxRow.add(new Integer(i)) ;
            }
        }
        for (int i = 0; i < maxRow.size(); i++) {
            System.out.print(maxRow.get(i) + " ");
        }
        System.out.println();
    }

    private static void fillTheArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 2) ;
            }
        }
    }
    public static void printMatrix(int[][] array) {
        System.out.println("The random array is : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
