package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String s = (input.nextLine()).toUpperCase();
		char ch = s.charAt(0);
		if (ch >= 'A' && ch <= 'Z') {

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				System.out.println(ch + " is a vowel");
			else
				System.out.println(ch + " is a consonant");
		} else
			System.out.println(ch + " is an invalid input");

	}

}
