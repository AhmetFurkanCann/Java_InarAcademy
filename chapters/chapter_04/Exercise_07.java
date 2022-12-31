package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the radius of the bounding circle:");
		double r= input.nextDouble();
		double angle1=(Math.PI / 2);
		double angle2=(Math.PI / 2) + 2 * Math.PI / 5;
		double angle3=(Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5 ;
		double angle4=(Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5 + 2 * Math.PI / 5 ;
		double angle5=(Math.PI / 2) + 2 * Math.PI / 5 + 2 * Math.PI / 5 + 2 * Math.PI / 5 +  2 * Math.PI / 5 ;
		double x1= ((int)(r * Math.cos(angle1)) * 100) / 100.0;
		double y1= r * Math.sin(angle1);
		double x2= r * Math.cos(angle2);
		double y2= r * Math.sin(angle2);
		double x3= r * Math.cos(angle3);
		double y3= r * Math.sin(angle3);
		double x4= r * Math.cos(angle4);
		double y4= r * Math.sin(angle4);
		double x5= r * Math.cos(angle5);
		double y5= r * Math.sin(angle5);
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.println("Point 1  : ( " + x1 + "," + y1 + ")");
		System.out.println("Point 2  : ( " + x2 + "," + y2 + ")");
		System.out.println("Point 3  : ( " + x3 + "," + y3 + ")");
		System.out.println("Point 4  : ( " + x4 + "," + y4 + ")");
		System.out.println("Point 5  : ( " + x5 + "," + y5 + ")");
		
		

	}

}
