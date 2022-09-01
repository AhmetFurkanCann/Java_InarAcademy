package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters:");
		String s = (input.nextLine()).toUpperCase();
		char ch1 = s.charAt(0);
		char ch2 = s.charAt(1);
		if (!(ch1 == 'M' || ch1 == 'C' || ch1 == 'I') || (ch2 < '1' || ch2 > '4'))
			System.out.println("Invalid input");
		else {
			if (ch1 == 'M') {
				System.out.print("Mathematics ");
				switch (ch2) {
				case '1':
					System.out.print("Freshman");
					break;
				case '2':
					System.out.print("Sophomore");
					break;
				case '3':
					System.out.print("Junior");
					break;
				case '4':
					System.out.print("Senior");
				}
			} else if (ch1 == 'C') {
				System.out.print("Computer Science ");
				switch (ch2) {
				case '1':
					System.out.print("Freshman");
					break;
				case '2':
					System.out.print("Sophomore");
					break;
				case '3':
					System.out.print("Junior");
					break;
				case '4':
					System.out.print("Senior");
				}
			} else {
				System.out.print("Information Technology ");
				switch (ch2) {
				case '1':
					System.out.print("Freshman");
					break;
				case '2':
					System.out.print("Sophomore");
					break;
				case '3':
					System.out.print("Junior");
					break;
				case '4':
					System.out.print("Senior");
				}
			}

		}

	}
}
