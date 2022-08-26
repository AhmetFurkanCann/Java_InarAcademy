package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pc = (int) (Math.random() * 3);

		System.out.print(" Enter 0 for scissor , 1 for rock , 2 for paper : ");
		int me = input.nextInt();

		if (pc == 0)
			System.out.println("The computer is scissor.");
		else if (pc == 1)
			System.out.println("The computer is rock.");
		else
			System.out.println("The computer is paper");

		if (me == 0)
			System.out.println("You are scissor.");
		else if (me == 1)
			System.out.println("You are rock.");
		else
			System.out.println("You are paper");

		if ((me == 0 && pc == 2) || (me == 1 && pc == 0) || (me == 2 && pc == 1))
			System.out.println(" You won");
		else if (me == pc)
			System.out.println("draw");
		else
			System.out.println("pc won");

	}

}
