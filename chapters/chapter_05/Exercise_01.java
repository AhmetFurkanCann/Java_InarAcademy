package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		int positive = 0;
		int negative = 0;
		int number = -1;

		Scanner input = new Scanner(System.in);

		do {

			System.out.print("Enter an integer (the input ends if it is 0): ");
			number = input.nextInt();

			sum += number;
			if (number < 0) {
				negative++;
				count++;
			}
			if (number > 0) {
				positive++;
				count++;

			}
			if (count == 0 && number == 0) {
				System.out.println("No numbers are entered except 0");
				System.exit(0);
			}
			
		} while (number != 0);

		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + sum);
		System.out.printf("The average is %.2f", (sum / count));
	}

}
