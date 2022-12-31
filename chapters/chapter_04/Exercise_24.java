package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first city:");
		String firstCity = input.nextLine();
		System.out.println("Enter the second city:");
		String secondCity = input.nextLine();
		System.out.println("Enter the third city:");
		String thirdCity = input.nextLine();
		if (firstCity.compareToIgnoreCase(secondCity) < 0 && secondCity.compareToIgnoreCase(thirdCity) < 0 )
			System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity ) ;
		else if (secondCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(thirdCity) < 0)
			System.out.println("The three cities in alphabetical order are " + secondCity + " " + firstCity + " " + thirdCity );
		else if (thirdCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(secondCity) < 0)
			System.out.println("The three cities in alphabetical order are " + thirdCity + " " + firstCity + " " + secondCity);
		else if (firstCity.compareToIgnoreCase(secondCity) < 0 && secondCity.compareToIgnoreCase(thirdCity) > 0)
			System.out.println("The three cities in alphabetical order are " + firstCity + " " + thirdCity + " " + secondCity);
		else if (secondCity.compareToIgnoreCase(firstCity) < 0 && firstCity.compareToIgnoreCase(thirdCity) > 0)
			System.out.println("The three cities in alphabetical order are " + secondCity + " " + thirdCity + " " + firstCity );
		else 
			System.out.println("The three cities in alphabetical order are" + thirdCity + " " + secondCity + " " + firstCity);
			
		
		
		
	}

}
