package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter year: (e.g., 2012):");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12:");
		int m = input.nextInt();
		System.out.println("Enter the day of the month:");
		int q = input.nextInt();
		if (m == 1 || m == 2) {
			if (m == 1) {
				m = 13;
			}
			else {
				m=14;
			}
			
			year--;
		}
		int h = (q + (26 * (m + 1)) / 10 + (year % 100) 
				+ (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
		
		System.out.print("Day of the week is ");
		
		switch (h) {
		 case 0: System.out.print("Saturday"); break;
		 case 1: System.out.print("Sunday"); break;
		 case 2: System.out.print("Monday") ; break;
		 case 3: System.out.print("Tuesday"); break;
		 case 4: System.out.print("Wednesday"); break;
		 case 5: System.out.print("Thursday"); break;
		 case 6: System.out.print("Friday") ; 
		}
	}

}
