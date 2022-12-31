package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_42 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter COMMISSION_SOUGHT : ");
		double commissionSought = input.nextDouble();
		double result = 0;
		int baseSalary = 5000;
		double salesAmount = 0;
		if (commissionSought <= 5000) {
			System.out.println("You have already earned your aim with your base Salary !");
		} else {

			for (double count = 0.01; result < commissionSought; count = count + 0.01) {

				double commission;

				if (count > 10000) {
					commission = (5000 * 0.08) + (5000 * 0.10) + ((count - 10000) * 0.12);
					result = 5000 + commission;
					salesAmount = count;
				} else if (count > 5000 && count < 10000) {
					commission = (5000 * 0.08) + ((count - 5000) * 0.10);
					result = 5000 + commission;
					salesAmount = count;
				} else {
					commission = (5000 * 0.08) + (5000 * 0.10) + ((count - 10000) * 0.12);
					result = 5000 + commission;
					salesAmount = count;

				}
			}
			System.out.printf("Minimum sales you have to generate in order to make %.2f  is : %.0f", commissionSought,
					salesAmount);
		}

	}
}
