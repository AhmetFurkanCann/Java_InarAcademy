package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter 5 Numbers : ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }
        System.out.println("Sum of the numbers : " + sum(list));
    }

    private static double sum(ArrayList<Double> list) {
        double sum = 0;
        int size  = list.size();
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        return sum ;
    }
}
