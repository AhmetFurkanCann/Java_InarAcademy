package chapters.chapter_05;

public class Exercise_19 {

	public static void main(String[] args) {
		int lines = 8 ;
		
		for (int i = 0 ; i < lines ; i++) {
			for (int j = lines ; j > i ; j--) {
				System.out.print("    ");
			}
			for (int k = 0 ; k <= i ; k++) {
				System.out.printf("%4d" , (int)(Math.pow(2, k)));
				
			}
			for (int l = i -1 ; l >= 0 ; l--) {
				System.out.printf("%4d" , (int)Math.pow(2, l) );
			}
			System.out.println();
		}
		
	}

}
