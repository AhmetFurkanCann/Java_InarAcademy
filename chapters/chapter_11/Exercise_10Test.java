package chapters.chapter_11;

import java.util.Scanner;

public class Exercise_10Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise_10MyStack stack = new Exercise_10MyStack();
        System.out.print("Enter five String : ");
        for (int i = 0; i < 5; i++) {
            String s = input.nextLine();
            stack.push(new String(s));
        }
        int size = stack.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }
}
