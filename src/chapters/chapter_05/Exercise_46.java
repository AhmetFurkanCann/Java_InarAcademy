package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter String: ");
		String s = input.nextLine() ;
		String result = "" ;
		for (int i = s.length() - 1 ; i >= 0 ; i--) {
			result += s.charAt(i) + "" ;
		}
		System.out.println("The reversed string is : " + result);
	}

}
