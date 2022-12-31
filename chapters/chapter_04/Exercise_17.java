package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month:");
		String s = (input.next()).toUpperCase();
		boolean leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		switch (s) {
		case "JAN" : System.out.println("Jan " + year + " has 31 days");break;
		case "FEB" : System.out.println("Feb" + year + " has" + ((leap) ? "29" : "28") + "days" );break;
		case "MAR" : System.out.println("MAR " + year + " has 31 days");break;
		case "APR" : System.out.println("APR " + year + " has 30 days");break;
		case "MAY" : System.out.println("MAY " + year + " has 31 days");break;
		case "JUN" : System.out.println("JUN " + year + " has 30 days");break;
		case "JUL" : System.out.println("JUL " + year + " has 31 days");break;
		case "AUG" : System.out.println("AUG " + year + " has 31 days");break;
		case "SEP" : System.out.println("SEP " + year + " has 30 days");break;
		case "OCT" : System.out.println("OCT " + year + " has 31 days");break;
		case "NOV" : System.out.println("NOV " + year + " has 30 days");break;
		case "DEC" : System.out.println("DEC " + year + " has 31 days");
		}
		
	}

}
