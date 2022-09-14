package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Loan Amount : ");
		double loanAmount= input.nextDouble();
		System.out.println("Enter Number Of Years  : ");
		int years = input.nextInt();
		System.out.println("Enter Annual Interest Rate:");
		double interestRate=input.nextDouble();
		
		double monthlyPayment = loanAmount*(interestRate / 1200 ) / (1 - (Math.pow(1 / (1 + (interestRate / 1200 )), years * 12)));
		
		double totalPayment = monthlyPayment * 12 * years ;
		
		System.out.printf("Monthly Payment: %.2f " , monthlyPayment );
		System.out.println();
		System.out.printf("Total Payment: %.2f " , totalPayment );
		System.out.println();
		
		double interest ;
		double principal ;
		double balance = loanAmount ;
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int i = 1; i <= years * 12; i++) {
			interest = (interestRate / 1200 ) * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + interest
			+ "\t\t" + principal + "\t\t" + balance);
			}
		
		
	}

}
