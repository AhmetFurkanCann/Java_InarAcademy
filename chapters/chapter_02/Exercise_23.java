package chapters.chapter_02;
import java.util.Scanner ;
public class Exercise_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance:");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon:");
		double milesPerGallon = input.nextDouble();
		System.out.println("Enter price per gallon:");
		double pricePerGallon = input.nextDouble();
		System.out.println("The cost of driving is $" + ((int)(((distance / milesPerGallon) * pricePerGallon) * 100) / 100.0 ));
		
	}

}
