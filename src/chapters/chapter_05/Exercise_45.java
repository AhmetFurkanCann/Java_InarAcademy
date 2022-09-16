package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter ten numbers: ");
		double mean = 0 ;
		double deviationSquare = 0 ;
		
		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			mean += number;
			deviationSquare += Math.pow(number, 2);
		}
		
		
		double deviation = Math.sqrt((deviationSquare - (Math.pow(mean, 2) / 10)) / (10 - 1));
		System.out.println("The mean is " + (mean / 10 ));
		System.out.println("The standard deviation is " + deviation);
	}

}
