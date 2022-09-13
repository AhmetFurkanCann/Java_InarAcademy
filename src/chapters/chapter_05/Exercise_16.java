package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		System.out.print("Smallest factors of number " + number + " is : ");
		int k = 2;
		while (number != 1) {
			if (number % k == 0) {

				System.out.print(k + " ");
				number /= k;

			} else {
				k++;
			}
		}
	}

}
