package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if (number1 < number2 && number2 < number3) {
			System.out.println(number1 + " " + number2 + " " + number3);
		} else if (number2 < number1 && number1 < number3) {
			System.out.println(number2 + " " + number1 + " " + number3);
		} else if (number3 < number1 && number1 < number2) {
			System.out.println(number3 + " " + number1 + " " + number2);
		} else if (number3 < number2 && number2 < number1) {
			System.out.println(number3 + " " + number2 + " " + number1);
		} else if (number2 < number3 && number3 < number1) {
			System.out.println(number2 + " " + number3 + " " + number1);
		} else {
			System.out.println(number1 + " " + number3 + " " + number2);
		}
	}

}
