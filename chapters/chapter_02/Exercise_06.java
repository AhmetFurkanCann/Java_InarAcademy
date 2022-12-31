package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int sum = 0 ;
		
		sum += number % 10 ;
		number = number / 10 ;
		sum += number % 10 ;
		number = number / 10 ;
		sum += number % 10 ;
		
		System.out.println("The sum of the digits is " + sum );
		
		
		
		
	}

}
