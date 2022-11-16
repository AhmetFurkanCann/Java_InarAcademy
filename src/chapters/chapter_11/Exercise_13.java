package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 Integer : ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list) ;
        int size = list.size();
        for (int i = 0;i < size ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(result.contains(list.get(i)))) {
                result.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(result) ;
    }
}
