package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		String s = (input.nextLine()).toUpperCase();
		char ch = s.charAt(0);

		if (ch >= '0' && ch <= '9')
			System.out.println("The hex value is " + ch);
		else if (ch >= 'A' && ch <= 'F') {
			System.out.println("The hex value is ");
			switch (ch) {
			case 'A':
				System.out.println("10");
				break;
			case 'B':
				System.out.println("11");
				break;
			case 'C':
				System.out.println("12");
				break;
			case 'D':
				System.out.println("13");
				break;
			case 'E':
				System.out.println("14");
				break;
			case 'F':
				System.out.println("15");

			}
		} 
		else
			System.out.println(ch + " is an invalid input");
	}

}
