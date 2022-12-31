package chapters.chapter_02;
import java.util.Scanner;

public class Checkpoint_02_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();

		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100);

	}

}
