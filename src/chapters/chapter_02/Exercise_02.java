package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double area = radius * radius * 3.14;
		double volume = area * lenght;
		System.out.println("The area is " + area );
		System.out.println("The volume is "+ volume);
	}
}
