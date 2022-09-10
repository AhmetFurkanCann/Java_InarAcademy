package chapters.chapter_05;

public class Checkpoint_05_13 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i <= 1000; i++) {
		sum = sum + i;
		}
		System.out.println(sum);
		
		int i = 0 ;
		sum = 0 ;
		do {
			sum += i ;
			i++;
			} while (i <= 1000);
		System.out.println(sum);
		
		i= 0 ;
		sum = 0 ;
		while (i <= 1000) {
			sum += i ;
			i++;
			}
		System.out.println(sum);
		
		
	}

}
