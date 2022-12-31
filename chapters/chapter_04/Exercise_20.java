package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter String");
		String s = input.nextLine();
		System.out.println("Length of the string : " + s.length());
		System.out.println("First character of the string : " + s.charAt(0));
		
	}

}
