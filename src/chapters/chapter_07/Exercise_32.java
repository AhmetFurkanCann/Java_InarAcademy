package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int numberOfValues = input.nextInt();
        int[] list = new int[numberOfValues];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int partition = partition(list);
        System.out.println("Index of the pivot after the partition : " + partition);
    }

    public static int partition(int[] list) {
        int[] result = new int[list.length];
        int pivot = list[0];
        int high = list.length - 1;
        int low = 0;
        for (int i = 1; i < list.length; i++) {
            if(list[i] < pivot ) {
                result[low] = list[i];
                low++;
            }
            else {
                result[high] = list[i];
                high-- ;
            }
        }
        result[low] = pivot;
        list = result ;

        displayTheListAfterPartition(list);

        return (low);
    }

    public static void displayTheListAfterPartition(int[] list) {
        System.out.print("After the partition , the list is : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

