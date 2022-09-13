package chapters.chapter_05;

public class Exercise_20 {

	public static void main(String[] args) {
		
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		int count = 0;
		int number = 2; 

		System.out.println("Prime numbers between 2 and 1,000 \n");

		while (number < 1000) {

			boolean isPrime = true; // Is the current number prime?

			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}

			if (isPrime) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {

					System.out.println(number);
				} else
					System.out.print(number + " ");
			}

			number++;
		}
	}

}
