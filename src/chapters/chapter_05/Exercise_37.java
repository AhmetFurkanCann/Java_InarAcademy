package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number : ");
		int number = input.nextInt();
		if (number == 0) {
			System.out.println("Binary value of 0 is : " + "0");
		} else {
			int value = number;
			String s = "";
			while (number >= 1) {

				if (number % 2 == 0) {
					s = 0 + s;
				} else {
					s = 1 + s;
				}

				number /= 2;
			}
			System.out.println("Binary value of " + value + " is : " + s);
		}
	}

}
