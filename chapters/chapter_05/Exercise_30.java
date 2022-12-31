package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount : ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate : ");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter the the number of months : ");
		int months = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;

		double account = 0;
		for (int i = 0; i < months; i++) {
			account = (amount + account) * (1 + monthlyInterestRate);

		}
		System.out.printf("The amount in the savings account after %d  is  : %.2f" , months , account);

	}

}
