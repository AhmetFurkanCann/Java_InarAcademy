package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		int smallest = 0 ;
		if (n1 < n2) {
			smallest = n1 ;
		}else {
			smallest = n2 ;
		}

		int gcd = 1; 
		int k = smallest; 
		while (k > 0 ) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k; 
				break;
			}
				gcd = k; 
			k--;
		}

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

}
