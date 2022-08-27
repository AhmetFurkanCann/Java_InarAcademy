package chapters.chapter_03;
import java.util.Scanner;
public class Checkpoint_03_14b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 2 == 0)
			System.out.println
			(number + " is even");
			else if (number % 5 == 0)
			System.out.println
			(number + " is multiple of 5");

	}

}
