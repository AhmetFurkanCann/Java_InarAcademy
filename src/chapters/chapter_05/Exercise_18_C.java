package chapters.chapter_05;

public class Exercise_18_C {

	public static void main(String[] args) {
		System.out.println("Pattern C");
		for (int i = 1 ; i < 7 ; i++) {
			for (int j = 6 ; j > i ; j--) {
				System.out.print("  ");
			}
			for (int k = i ; k >= 1 ;k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
