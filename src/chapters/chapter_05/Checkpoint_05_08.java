package chapters.chapter_05;

public class Checkpoint_05_08 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 10; ++i) {
			sum += i;
		}
		
		System.out.println(sum);
		sum = 0 ;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
