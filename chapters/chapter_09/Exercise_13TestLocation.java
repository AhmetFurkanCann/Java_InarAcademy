package chapters.chapter_09;

import java.util.Scanner;

public class Exercise_13TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array : ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] a = new double[row][column];
        System.out.println("Enter the array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        Exercise_13Location x = Exercise_13Location.locateLargest(a);
        System.out.println("The location of the largest element is " + x.maxValue + " at ( " + x.row + " , " + x.column + " )") ;
    }
}
