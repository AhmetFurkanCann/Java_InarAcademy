package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a letter:");
		String s = (input.nextLine()).toUpperCase();
		char ch = s.charAt(0);
		if (ch >= 'A' && ch <= 'C')
			System.out.println("The corresponding number is 2");
		else if (ch >= 'D' && ch <= 'F')
			System.out.println("The corresponding number is 3");
		else if (ch >= 'G' && ch <= 'I')
			System.out.println("The corresponding number is 4");
		else if (ch >= 'J' && ch <= 'L')
			System.out.println("The corresponding number is 5");
		else if (ch >= 'M' && ch <= 'O')
			System.out.println("The corresponding number is 6");
		else if (ch >= 'P' && ch <= 'S')
			System.out.println("The corresponding number is 7");
		else if (ch >= 'T' && ch <= 'V')
			System.out.println("The corresponding number is 8");
		else if (ch >= 'W' && ch <= 'Z')
			System.out.println("The corresponding number is 9");
		else
			System.out.println(ch + " is an invalid input");
	}

}
