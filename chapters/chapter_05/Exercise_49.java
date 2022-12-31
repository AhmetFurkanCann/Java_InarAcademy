package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = input.nextLine() ;
		s.toLowerCase();
		int vowels = 0 ;
		int consonants = 0 ;
		for (int i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u') {
				vowels++;
			}
			else if (s.charAt(i)!= '\n' && s.charAt(i)!= '\t' && s.charAt(i)!= '\r' && s.charAt(i)!= ' ') {
				consonants++;
			}
		}
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		
	}

}
