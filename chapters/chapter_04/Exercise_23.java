package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter employee's name:");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week:");
		double hoursWorked= input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double payRate= input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double federalTaxWithholdingRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTaxWithholdingRate = input.nextDouble();
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + payRate );
		System.out.println("Gross Pay: " + (hoursWorked * payRate));
		System.out.println("Deductions:");
		double federalWithholding = ((hoursWorked * payRate) * federalTaxWithholdingRate) ;
		double stateTaxWithholding = ((hoursWorked * payRate) * stateTaxWithholdingRate) ;
		double totalDeduction = ((((hoursWorked * payRate) * federalTaxWithholdingRate)) + ((hoursWorked * payRate) * stateTaxWithholdingRate)) ;
		double netPay = ( (hoursWorked * payRate) - ((((hoursWorked * payRate) * federalTaxWithholdingRate)) + ((hoursWorked * payRate) * stateTaxWithholdingRate)) ) ;
		System.out.printf("Federal Withholding (20.0): %.2f \n" , federalWithholding);
		System.out.printf("State Withholding (9.0): %.2f \n" , stateTaxWithholding);
		System.out.printf("Total Deduction: %.2f \n" , totalDeduction );
		System.out.printf("Net Pay: %.2f \n " ,netPay );
	}

}
