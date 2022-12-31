package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_29 {
    public static void main(String[] args) {
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        System.out.println("Enter list1: ");
        getInputForList(list1);
        System.out.println("Enter list2: ");
        getInputForList(list2);
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical ");
        } else {
            System.out.println("The two arrays are not identical ");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] oneDimentionalM1 = sort(m1);
        int[] oneDimentionalM2 = sort(m2);
        if (oneDimentionalM1.length != oneDimentionalM2.length){
            return false;
        }
        for (int i = 0; i < oneDimentionalM1.length; i++) {
           if(oneDimentionalM1[i] != oneDimentionalM2[i]){
               return false;
           }
        }
        return true;
    }

    public static int[] sort(int[][] array) {
        int[] list = new int[array.length * array[0].length];
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[0].length; k++) {
                list[count] = array[j][k];
                count++;
            }
        }
        selectionSort(list);
        return list ;
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }


            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void getInputForList(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
