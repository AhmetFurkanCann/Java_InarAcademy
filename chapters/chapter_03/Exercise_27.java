package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  x-y coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double intersectionx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersectiony = (-y * (200 * 100)) / (-y * 200 - x * 100);

		if ((x > intersectionx || y > intersectiony))
			System.out.println("The point is not in the triangle");
		else
			System.out.println("The point is in the triangle");

	}

}
