package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount : ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual percentage yield : ");
		double annualPercentageYield = input.nextDouble();
		System.out.println("Enter the the number of months : ");
		int months = input.nextInt();

		double monthlyPercentageYield = annualPercentageYield / 1200;
		double cd = amount;
		System.out.println("Month  CD Value");
		for (int i = 1; i <= months; i++) {
			cd = cd + (cd * monthlyPercentageYield);
			System.out.printf("%-5d%2s%-8.2f" , i , " " , cd);
			System.out.println();
		}
		
	}

}
