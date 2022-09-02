package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a SSN:");
		String s = input.nextLine();
		boolean valid = Character.isDigit(s.charAt(0)) &&  
				Character.isDigit(s.charAt(1)) && 
				Character.isDigit(s.charAt(2)) &&
				Character.isDigit(s.charAt(4)) &&
				Character.isDigit(s.charAt(5)) &&
				Character.isDigit(s.charAt(7)) &&
				Character.isDigit(s.charAt(8)) &&
				Character.isDigit(s.charAt(9)) &&
				Character.isDigit(s.charAt(10)) &&
				s.length() == 11 && s.charAt(3) == '-' &&
				s.charAt(6) == '-' ;
		if (valid)
			System.out.println(s + " is a valid social security number");
		else 
			System.out.println(s + " is an invalid social security number");
	}

}
