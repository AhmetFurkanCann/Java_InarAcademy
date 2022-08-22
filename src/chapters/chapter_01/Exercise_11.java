package chapters.chapter_01;

public class Exercise_11 {
	public static void main(String[] args) {
		System.out.println("Current population is 312,032,486 ");
		System.out.println(
				"1.Year's population is " + (312032486 + ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0)
						+ ((60 * 60 * 24 * 365) / 45.0));
		System.out.println("2.Year's population is " + (312032486
				+ (2 * ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0) + ((60 * 60 * 24 * 365) / 45.0)));
		System.out.println("3.Year's population is " + (312032486
				+ (3 * ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0) + ((60 * 60 * 24 * 365) / 45.0)));
		System.out.println("4.Year's population is " + (312032486
				+ (4 * ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0) + ((60 * 60 * 24 * 365) / 45.0)));
		System.out.println("5.Year's population is " + (312032486
				+ (5 * ((60 * 60 * 24 * 365) / 7.0) - (60 * 60 * 24 * 365) / 13.0) + ((60 * 60 * 24 * 365) / 45.0)));
	}

}
