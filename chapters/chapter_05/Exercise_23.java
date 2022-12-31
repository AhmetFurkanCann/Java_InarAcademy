package chapters.chapter_05;

public class Exercise_23 {

	public static void main(String[] args) {
		double result = 1 ;
		for (int i = 2 ; i <= 50000 ; i++ ) {
			result += 1.0 / i ;
		}
		System.out.println("Computing from left to right , the result is : " + result ) ; 
		
		result = 1 ;
		
		for (int i = 50000 ; i >= 2 ; i-- ) {
			result += 1.0 / i ;
		}
		System.out.println("Computing from right to left , the result is : " + result ) ; 
	}

}
