package chapters.chapter_02;

import java.util.Scanner;


public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		double a = (int)(((v1 - v0) / t) * 10000 ) / 10000.0 ;
		System.out.println("The average acceleration is " + a);
		

	}

}
