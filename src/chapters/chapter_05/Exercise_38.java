package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number : ");
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("Octal value of 0 is : " + "0");
		} else {
			int value = number;
			String s = "";
			while (number >= 1) {

				s = (number % 8) + s;

				number /= 8;
			}
			System.out.println("Octal value of " + value + " is : " + s);
		}
	}
}
