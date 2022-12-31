package chapters.chapter_05;

public class Exercise_39 {

	public static void main(String[] args) {
		double goal = 30000 ;
		int baseSalary = 5000 ;
		double first5000Commission = 5000 * 0.08 ;
		double second5000Commission = 5000 * 0.10 ;
		goal = goal  - (first5000Commission + second5000Commission) ;
		double count = 0 ;
	
		while ( true ) {
			
			if ( count * 0.12 >= goal) {
				break ;
			}
			count = count + 0.01 ;
		}
		System.out.printf("Minimum sales you have to generate in order to make $30,000 is : %.0f" , (count + 10000));
	}

}
