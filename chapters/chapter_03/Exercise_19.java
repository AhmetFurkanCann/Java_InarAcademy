package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three edges for a triangle");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		if (s1 + s2 > s3 && s1 + s3 > s2 && s3 + s2 > s1)
			System.out.println("The perimeter of the triangle is " + (s1 + s2 + s3));
		else
			System.out.println("The input is invalid. The input is valid if the sum of every pair of two edges is\r\n"
					+ "greater than the remaining edge");
	}
}
