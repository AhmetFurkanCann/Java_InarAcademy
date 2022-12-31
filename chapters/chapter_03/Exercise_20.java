package chapters.chapter_03;
import java.util.Scanner ;
public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		double ta = input.nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		double v = input.nextDouble();
		if (ta < 41 && ta > -58 && v >= 2) {
			double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
			System.out.println("The wind chill index is " + ((int)(twc * 100000)) / 100000.0);
		}
		else {
			if ((ta > 41 || ta < -58) && v < 2)
				System.out.println("Temperature in Fahrenheit and wind speed are invalid");
			else if ((ta > 41 || ta < -58) && v >= 2)
				System.out.println("Temperature in Fahrenheit is invalid");
			else
				System.out.println(" Wind speed are invalid");
		}
			
	}

}
