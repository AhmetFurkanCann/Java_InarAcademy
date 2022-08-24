package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years : ");
		int years = input.nextInt();
		int population= (int) (312032486 + (years * ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0) + ((60 * 60 * 24 * 365) / 45.0));
		System.out.println("The population in " + years + " years is " + population);
	}

}
