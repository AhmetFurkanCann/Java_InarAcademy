package chapters.chapter_05;

public class Exercise_06 {

	public static void main(String[] args) {
		System.out.println("Miles           Kilometers       |       Kilometers           Miles");
		for (int i = 1, j = 20; i < 11 && j < 66; i++, j = j + 5) {
			System.out.printf("%-5d%11s%-10.3f", i, " ", (i * 1.609));
			System.out.print("       |       ");
			System.out.printf("%-10d%11s%-5.3f", j, " ", (j / 1.609));
			System.out.println();

		}
	}

}
