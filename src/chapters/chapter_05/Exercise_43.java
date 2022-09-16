package chapters.chapter_05;

public class Exercise_43 {

	public static void main(String[] args) {

		String combinations = "";
		int count = 0 ;
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (i == j) {
					break ;
				}
				else {
					combinations += "(" + i + "," + j + ")" + " " ;
					count++ ;
				}
			}
		}
		System.out.println(combinations);
		System.out.println("The total number of all combinations is " + count);

	}
}
