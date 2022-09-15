package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int iban = input.nextInt();
		String digits = "";
		for (int i = 100000000; i >= 1; i /= 10) {
			digits += (iban / i) + "";
			iban = iban % i;
		}
		
		int checksum = ((Integer.parseInt(digits.charAt(0) + "")) * 1 + (Integer.parseInt(digits.charAt(1) + "")) * 2
				+ (Integer.parseInt(digits.charAt(2) + "")) * 3 + (Integer.parseInt(digits.charAt(3) + "")) * 4
				+ (Integer.parseInt(digits.charAt(4) + "")) * 5 + (Integer.parseInt(digits.charAt(5) + "")) * 6
				+ (Integer.parseInt(digits.charAt(6) + "")) * 7 + (Integer.parseInt(digits.charAt(7) + "")) * 8
				+ (Integer.parseInt(digits.charAt(8) + "") * 9)) % 11;
		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + ((Integer.parseInt(digits.charAt(0) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(1) + ""))) + "" + ((Integer.parseInt(digits.charAt(2) + "")))
					+ "" + ((Integer.parseInt(digits.charAt(3) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(4) + ""))) + "" + ((Integer.parseInt(digits.charAt(5) + "")))
					+ "" + ((Integer.parseInt(digits.charAt(6) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(7) + ""))) + "" + ((Integer.parseInt(digits.charAt(8) + "")))
					+ "" + "X");
		} else {
			System.out.println("The ISBN-10 number is " + ((Integer.parseInt(digits.charAt(0) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(1) + ""))) + "" + ((Integer.parseInt(digits.charAt(2) + "")))
					+ "" + ((Integer.parseInt(digits.charAt(3) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(4) + ""))) + "" + ((Integer.parseInt(digits.charAt(5) + "")))
					+ "" + ((Integer.parseInt(digits.charAt(6) + ""))) + ""
					+ ((Integer.parseInt(digits.charAt(7) + ""))) + "" + ((Integer.parseInt(digits.charAt(8) + "")))
					+ "" + checksum);
		}
	}

}
