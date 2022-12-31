package chapters.chapter_05;

public class Exercise_33 {

	public static void main(String[] args) {
		System.out.print("Four perfect numbers less than 10,000 are : ");
		for (int i = 1; i < 10000; i++) {
			int count = 0;
			int k = 1;
			while (k <= i / 2) {

				if (i % k == 0) {
					count += k;
				}
			k++;	
			}
			if ( i == count) {
				System.out.print(i + " ");
			}
		}
	}
}
