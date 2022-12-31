package weeks.week_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age of three people");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int max;
		int min;
		if (n1 > n2 && n1 > n3) {
			max = n1;
			if (n2 > n3)
				min = n3;
			else
				min = n2;

		} else if (n2 > n3 && n2 > n1) {
			max = n2;
			if (n1 > n3)
				min = n3;
			else
				min = n1;

		} else {
			max = n3;
			if (n2 > n1)
				min = n1;
			else
				min = n2;
		}
		System.out.println("Youngest= " + min + " Oldest= " + max);

	}
}
