package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Loan Amount : ");
		double loanAmount= input.nextDouble();
		double totalPayment = loanAmount;
		System.out.println("Enter Number of Years : ");
		int years = input.nextInt();
		System.out.println("Interest Rate        Monthly Payment         Total Payment");
		
		for (double i = 5.0 ; i <= 8 ; i = i +  0.125 ) {
			
			double monthlyPayment = loanAmount * (i / 1200) / (1 - 1 / Math.pow(1 + (i / 1200), years * 12));
			totalPayment = monthlyPayment * years * 12;
			System.out.printf("%d", (int)(i * 1000));
			System.out.print("%");
			System.out.printf("%16s%-15.2f%9s%-13.2f" ,  " " , monthlyPayment , " " , totalPayment);
			System.out.println();
		}
		
		
	}

}
