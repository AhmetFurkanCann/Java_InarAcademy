package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		double minutes = input.nextInt();
		int days = (int) (minutes % (60 * 24 * 365)) / (24 * 60);
		int years = (int) minutes / (60 * 24 * 365);
		System.out.println(minutes + " minutes are approximately " + years + " years and " + days + " days");

	}

}
