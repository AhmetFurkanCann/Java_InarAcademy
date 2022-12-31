package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rectangle1's  x-y coordinates and width-height: ");
		
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();
		
		System.out.print("Enter rectangle2's x-y coordinates and width-height:  ");
		
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();

		if ((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2)
				&& (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2)
				&& (r1Height / 2 + r2Height / 2 <= r1Height) && (r1Width / 2 + r2Width / 2 <= r1Width))
			System.out.println("rectangle2 is inside rectangle1");
		else if ((r1x + r1Width / 2 > r2x - r2Width) || (r1y + r1Height / 2 > r2y - r2Height))
			System.out.println("rectangle2 overlaps rectangle1");
		else
			System.out.println("rectangle2 does not overlap rectangle1");
	}

}
