package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int iban = input.nextInt();
		int checksum = 0;
		int remainingDigit = iban ;
		System.out.print("The ISBN-10 number is ");
		for (int i = 1, j = 100000000; i < 10; i++, j /= 10) {
			checksum += (remainingDigit / j) * i;
			System.out.print((remainingDigit / j));
			remainingDigit %= j;
			
		}

		if (checksum % 11 == 10) {
			System.out.println("X");
		} else {
			System.out.println((checksum % 11));
		}
	}

}
