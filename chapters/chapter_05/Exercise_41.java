package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in );
		System.out.println("Enter numbers :");
		int number = input.nextInt();
		int count = 1 ;
		int max = number ;
		while (number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number ;
				count = 1 ;
			}
			else if (number == max) {
				count++;
				
			}
			
		}
		System.out.println("The largest number is " + max );
		System.out.println("The occurrence count of the largest number is " + count);
		
	}

}
