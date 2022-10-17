package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int numberOfValues = input.nextInt();
        int[] values = new int[numberOfValues];
        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        if(isConsecutiveFour(values)){
            System.out.println("The list has consecutive fours");
        }
        else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0 ;
        for (int i = 0; i < values.length - 1; i++) {
            if(values[i] == values[i + 1]){
                count++;
                if(count == 3){
                    return true;
                }
            }
            else {
                count = 0;
            }
        }
        return false ;
    }
}
