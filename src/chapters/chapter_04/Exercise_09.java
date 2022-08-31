package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a character:");
		String s = input.nextLine();
		System.out.println("The Unicode for the character E is " + (int) s.charAt(0));
	}

}
