package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}

}
