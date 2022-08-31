package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double angle1= Math.random() * Math.PI ;
		double angle2= Math.random() * Math.PI ;
		double angle3= Math.random() * Math.PI ;
		int r = 40 ;
		double x1= r * Math.cos(angle1);
		double y1= r * Math.sin(angle1);
		double x2= r * Math.cos(angle2);
		double y2= r * Math.sin(angle2);
		double x3= r * Math.cos(angle3);
		double y3= r * Math.sin(angle3);
		System.out.println("Point 1  : ( " + x1 + "," + y1 + ")");
		System.out.println("Point 2  : ( " + x2 + "," + y2 + ")");
		System.out.println("Point 3  : ( " + x3 + "," + y3 + ")");
		
		
	}

}
