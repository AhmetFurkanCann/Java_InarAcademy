package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1:");
        int numberOfValues = input.nextInt();
        int[] list1 = new int[numberOfValues];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2:");
        numberOfValues = input.nextInt();
        int[] list2 = new int[numberOfValues];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        int[] mergedList = mergeList(list1 , list2);
        System.out.print("The merged list is : ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }
    }

    public static int[] mergeList(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int countList1 = 0;
        int countList2 = 0;
        int countMergeList = 0;
        while( countList1 < list1.length && countList2 < list2.length){
            if(list1[countList1] < list2[countList2]){
                mergedList[countMergeList]= list1[countList1];
                countList1++;
            } else {
                mergedList[countMergeList] = list2[countList2];
                countList2++;
            }
            countMergeList++;
        }
        for (int i = countList1; i < list1.length; i++) {
            mergedList[countMergeList] = list1[i];
            countMergeList++;
        }
        for (int i = countList2; i < list2.length; i++) {
            mergedList[countMergeList] = list2[i];
            countMergeList++;
        }

        return mergedList ;
    }
}
