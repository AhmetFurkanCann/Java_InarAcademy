package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        System.out.println("Enter List1 :");
        getNumbers(list1);
        int[][] list2 = new int[3][3];
        System.out.println("Enter List2 :");
        getNumbers(list2);
        System.out.println("The two arrays "  + ((equals(list1 , list2)) ? " are " : " are not ") + "strictly identical");

    }

    public static boolean equals(int[][] list1, int[][] list2) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[0].length; j++) {
                if (list1[i][j] != list2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void getNumbers(int[][] numbers) {
        Scanner input = new Scanner(System.in) ;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j]= input.nextInt();
            }
        }
    }
}
