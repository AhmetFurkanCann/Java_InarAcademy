package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of sides:");
		int n=input.nextInt();
		System.out.println("Enter the side:");
		double side = input.nextDouble();
		double area= n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)) ;
		System.out.println("The area of the polygon is " + area);
	}

}
