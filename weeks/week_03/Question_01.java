package weeks.week_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		double salary = input.nextDouble();
		System.out.println("Enter your year of service ");
		double yearOfService = input.nextDouble();

		if (yearOfService > 5) {
			double bonus = salary * (0.05);
			salary += bonus;
			System.out.println("your bonus = " + bonus);
		}
		
		System.out.println("Your salary :" + salary);
	}
}
