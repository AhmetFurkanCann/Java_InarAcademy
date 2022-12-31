package chapters.chapter_05;

public class Exercise_18_D {

	public static void main(String[] args) {
		System.out.println("Pattern D");
		for (int i = 6 ; i > 0 ; i--) {
			for (int j = 6 ; (j - i ) > 0 ; j--) {
				System.out.print("  ");
			}
			for (int k = 1 ; k <= i ;k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
