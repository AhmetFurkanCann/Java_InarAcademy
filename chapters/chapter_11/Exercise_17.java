package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m : ");
        int m = input.nextInt();
        int n = algebra(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    private static int algebra(int m) {
        ArrayList<Integer> list = getFactors(m);
        ArrayList<Integer> result = getTheOddNumbers(list);
        int sum = 1 ;
        for (int i = 0; i < result.size(); i++) {
            sum *= result.get(i);
        }
        return sum ;
    }

    private static ArrayList<Integer> getTheOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        while (!list.isEmpty()){
           int number = list.get(0);
           count++;
           list.remove(0);
           if (!(list.contains(number))){
               if (count % 2 != 0){
                   result.add(new Integer(number));
               }
               count = 0;
           }
        }
        return result ;
    }

    private static ArrayList<Integer> getFactors(int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 2;
        while (m != 1) {
            if (m % k == 0){
                list.add(new Integer(k));
                m /= k ;
            }
            else {
                k++ ;
            }
        }
        return list ;
    }
}
