package chapters.chapter_01;

public class Exercise_12 {
	public static void main(String[] args) {
		System.out.println(" A runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds");
		System.out.println(
				" His average speed in kilometers per hour is " + ((24 * 1.6) / (1 + (40.0 / 60.0) + (35.0 / 3600.0))));
	}
}
