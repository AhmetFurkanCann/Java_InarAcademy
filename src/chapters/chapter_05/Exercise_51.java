package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1 = input.nextLine() ;
		System.out.println("Enter second String: ");
		String s2 = input.nextLine() ;
		String result = "" ;
		boolean isHave=false;
		for (int i = 1 ; i < s2.length() ; i++) {
			String sub= s2.substring(0, i) ;
			if (s1.startsWith(sub)) {
				result = sub ;
				isHave=true;
			}
		}
		if (isHave) {
		System.out.println("The common prefix is " + result);
		}
		else {
			System.out.println(s1 + " " + s2 + " have no common prefix");
		}
	}

}
