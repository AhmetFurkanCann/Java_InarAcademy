package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 Integer : ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        int size = list.size();
        for (int i = 0;i < size ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void sort(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int currentMin = list.get(i);
            int currentMinIndex = i ;
            for (int j = i + 1; j < size; j++) {
                if (currentMin > list.get(j)){
                    currentMin = list.get(j);
                    currentMinIndex = j ;
                }
            }
            if (currentMinIndex != i){
                list.set(currentMinIndex ,list.get(i)) ;
                list.set(i ,currentMin) ;
            }
        }
    }
}
