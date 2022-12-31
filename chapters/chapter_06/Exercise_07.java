package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200 ;
        System.out.println("Years      Future Value");
        for (int i = 1 ; i < 31 ; i++){
            System.out.printf("%-5d%6s%12.2f" , i , " " , futureInvestmentValue(investmentAmount , monthlyInterestRate , i ));
            System.out.println();
        }



    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12) ;
    }
}
