package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint_03_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = 0 ;
		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

	}

}
