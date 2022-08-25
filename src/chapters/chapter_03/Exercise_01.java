package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		if (discriminant > 0) {
			System.out.println("The equation has two roots " + ((-b + Math.pow(discriminant, 0.5)) / 2 * a) + " and "
					+ ((-b - Math.pow(discriminant, 0.5)) / 2 * a));
		} else if (discriminant == 0) {
			System.out.println("The equation has one root " + ((-b + Math.pow(discriminant, 0.5)) / 2 * a));
		} else {
			System.out.println("The equation has no real roots");
		}
	}

}
