package chapters.chapter_02;
import java.util.Scanner ;
public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an amount in integer, for example 1156:");
		int amount = input.nextInt();
		System.out.println(amount + " is " + (amount / 100) + " dollars " + (amount % 100) + " cents");
		
		
	}

}
