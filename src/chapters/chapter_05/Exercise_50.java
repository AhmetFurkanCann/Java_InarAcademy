package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = input.nextLine() ;
		int count = 0 ;
		for (int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("The number of uppercase letters is : " + count);
	}

}
