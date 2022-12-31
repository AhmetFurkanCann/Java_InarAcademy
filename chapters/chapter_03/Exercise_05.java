package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: (Sunday is 0, Monday is 1, …, and Saturday is 6) ");
		int todaysDay = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int elapsedDay = input.nextInt();
		int day = (todaysDay + elapsedDay) % 7 ;
		System.out.print("Today is ");
		switch (todaysDay) {
		 case 0: System.out.print("Sunday"); break;
		 case 1: System.out.print("Monday"); break;
		 case 2: System.out.print("Tuesday") ; break;
		 case 3: System.out.print("Wednesday"); break;
		 case 4: System.out.print("Thursday"); break;
		 case 5: System.out.print("Friday"); break;
		 case 6: System.out.print("Saturday") ; 
		}
		
		System.out.print(" and the future day is ");
		switch (day) {
		 case 0: System.out.print("Sunday"); break;
		 case 1: System.out.print("Monday"); break;
		 case 2: System.out.print("Tuesday") ; break;
		 case 3: System.out.print("Wednesday"); break;
		 case 4: System.out.print("Thursday"); break;
		 case 5: System.out.print("Friday"); break;
		 case 6: System.out.print("Saturday") ; 
		}
		
	}

}
