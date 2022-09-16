package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
		String s = input.nextLine();
		if (s.length() < 12 ) {
			System.out.println(s + " is an invalid input");
			
		}
		else {
			int sum = 0 ;
			for (int i = 0 ; i < s.length() ; i++) {
				if(i % 2 == 0) {
					sum += Integer.parseInt(s.charAt(i) + "") ;
				}
				else {
					sum += 3 * Integer.parseInt(s.charAt(i) + "") ;
				}
			}
			int checksum = 10 - (sum % 10) ;
			System.out.print("The ISBN-13 number is ");
			if (checksum==10) {
				System.out.println(s + "0");
			}else {
				System.out.println(s + checksum);
			}
		}
	}

}
