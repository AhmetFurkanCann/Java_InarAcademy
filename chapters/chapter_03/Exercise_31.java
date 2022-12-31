package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert = input.nextInt();
		System.out.println((convert < 0 || convert > 1) ? "incorrect input" : "");
		System.exit(1);
		System.out.println("Enter the dollar amount:");
		double amount = input.nextDouble();
		if (convert == 0) {
			System.out.print(amount + " $ is ");
			amount = amount * rate;
			System.out.print(amount + " yuan");

		} else {
			System.out.print(amount + "  yuan is $ ");
			amount = (((int) ((amount * 100) / rate)) / 100.0);
			System.out.println(amount);

		}

	}

}
