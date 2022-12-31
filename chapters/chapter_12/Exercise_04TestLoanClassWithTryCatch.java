package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_04TestLoanClassWithTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter annual interest rate: ");
            double interestRate = input.nextDouble();

            System.out.println("Enter numbers of years: ");
            int numberOfYears = input.nextInt();

            System.out.println("Enter loan amount: ");
            double loanAmount = input.nextDouble();
            Exercise_04LoanClassWithTryCatch loan = new Exercise_04LoanClassWithTryCatch(interestRate, numberOfYears,loanAmount);
            System.out.println(loan.getTotalPayment());
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
