package chapters.SetQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10 ; i++) {
            numbers.add(input.nextInt());
        }
        System.out.println("The number of distinct number is : " + numbers.size());
        System.out.print("The distinct numbers are: " + numbers);
    }
}
