package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = ((int) (Math.random() * 10) % 2);
		System.out.println("Enter your guess 0 for heads 1 for tails");
		int guess = input.nextInt();
		if (guess > 1 || guess < 0) {
			System.out.println("Wrong input Enter 0 or 1");
		} else if (number == guess) {
			System.out.println("guess is correct!");
		} else {
			System.out.println("guess is wrong");
		}
	}

}
