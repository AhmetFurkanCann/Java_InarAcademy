package chapters.chapter_03;
import java.util.Scanner;
public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the weight of the package");
		double weight = input.nextDouble();
		if (weight > 20)
			System.out.println("The package cannot be shipped");
		else {
			if (weight <= 1 && weight > 0 )
				System.out.println("Shipping cost is 3.5 dollars");
			else if (weight <=3 && weight >1)	
				System.out.println("Shipping cost is 5.5 dollars");
			else if (weight <= 10 && weight > 3 )
				System.out.println("Shipping cost is 8.5 dollars");
			else if (weight > 10 && weight <= 20)
				System.out.println("Shipping cost is 10.5 dollars");
			else 
				System.out.println("no info for weight>20");
		}
	}

}
