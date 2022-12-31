package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint_03_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		if (score >= 60.0)
			System.out.println("D");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 90.0)
			System.out.println("A");
		else
			System.out.println("F");
		
		System.out.println("if score is 100 both notes will be written");

	}

}
