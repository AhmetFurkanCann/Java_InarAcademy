package weeks.week_10;

import java.util.Scanner;

public class LiveClassExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = input.nextInt();
        System.out.println("Enter column :");
        int column = input.nextInt();
        int[][] array = new int[row][column];
        fill2DArrWithRandomValues(array , 0 , 10);
        int maxColumn = getTheColumnIndexWithMaxSum(array);
    }
    public static  void fill2DArrWithRandomValues (int[][] arr , int start , int limit ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * (limit - start)) + start);
            }
        }
    }
    public static  int getTheColumnIndexWithMaxSum(int[][] arr ) {
        int maxColumn = -1 ;
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < arr[i].length; i++) {
            int sumcolumns = 0;
            for (int j = 0; j < arr.length; j++) {
                sumcolumns += arr[j] [i];
            }
            if(sumcolumns >= max ){
                maxColumn = i ;
                max = sumcolumns ;
            }
        }
        return  maxColumn;
    }
}
