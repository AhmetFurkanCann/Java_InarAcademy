package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 :");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2 :");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        if(equals(list1 , list2)){
            System.out.println("Two lists are strictly identical");
        }
        else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    public static boolean equals(int[] list1, int[] list2) {
        if(list1.length != list2.length){
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
