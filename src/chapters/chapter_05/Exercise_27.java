package chapters.chapter_05;

public class Exercise_27 {

	public static void main(String[] args) {
		final int  NUMBER_OF_PRIMES_PER_LINE = 10 ;
		int count = 0 ;
		System.out.println("Leap Years from 101 to 2100 :");
		for (int i = 101 ; i <= 2100 ; i++) {
			
			boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
			
			if (isLeapYear) {
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {

				System.out.println(i);
				} else {
				System.out.print(i + " ");
				}
			
			}
		
		}
		System.out.println();
		System.out.println("Number of leap years from 101 to 2100 is : " + count);

	}
}
