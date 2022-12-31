package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint_03_07b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");

	}

}
