package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter integers (input ends with 0 ) : ");
        int value ;
        do {
            value = input.nextInt() ;
            if(!list.contains(value) && value != 0) {
                list.add(value);
            }
        }while (value != 0) ;
        System.out.println("Max value is : " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty() || list.size() == 0){
            return null;
        }
        else {
            return new Integer(java.util.Collections.max(list)) ;
        }
    }
}
