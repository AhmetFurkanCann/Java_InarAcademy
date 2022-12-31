package chapters.chapter_03;
import java.util.Scanner;
public class Exercise_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		double circle1x=input.nextDouble();
		double circle1y=input.nextDouble();
		double circle1Radius=input.nextDouble();
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		double circle2x=input.nextDouble();
		double circle2y=input.nextDouble();
		double circle2Radius=input.nextDouble();
		if (Math.pow(Math.pow(circle2x - circle1x, 2) + Math.pow(circle2y - circle1y, 2), 0.5) 
				<= Math.abs(circle1Radius - circle2Radius))
				System.out.println("circle2 is inside circle1");
			else if (Math.pow(Math.pow(circle2x - circle1x, 2) + Math.pow(circle2y - circle1y, 2), 0.5)
						<= circle1Radius + circle2Radius)
				System.out.println("circle2 overlaps circle1");
			else
				System.out.println("circle2 does not overlap circle1");
	}

}
