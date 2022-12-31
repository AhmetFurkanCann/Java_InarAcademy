package chapters.chapter_05;

public class Exercise_26 {

	public static void main(String[] args) {
		
	
		
		for  (int i = 10000 ; i <= 100000 ; i +=10000) {
			double e = 1 ;
			double factoriel = 1 ;
			for (int k = 1 ; k <= i ; k++ ) {
				factoriel *= (1.0 / k) ;
				e += factoriel;
			}
			System.out.println("e for i = " + i + " is : " + e );
		}
			

			
				
			
		
	
	}

}
