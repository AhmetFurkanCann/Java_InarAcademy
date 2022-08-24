package chapters.chapter_02;
import java.util.Scanner ;

public class Exercise_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the monthly saving amount :");
		double amount = input.nextDouble();
		double amountOfFirstYear = amount * (1 + 0.00417);
		double amountOfSecondYear = (amount + amountOfFirstYear) * (1 + 0.00417);
		double amountOfThirdYear = (amount + amountOfSecondYear) * (1 + 0.00417);
		double amountOfFourthYear = (amount + amountOfThirdYear) * (1 + 0.00417);
		double amountOfFifthYear = (amount + amountOfFourthYear) * (1 + 0.00417);
		double amountOfSixthYear = (amount + amountOfFifthYear) * (1 + 0.00417);
		System.out.println("After the sixth month , the account value is " + ((int)(amountOfSixthYear * 100)) / 100.0) ;
		
	}

}
