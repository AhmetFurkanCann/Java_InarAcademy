package chapters.chapter_07;

public class Exercise_06 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(number, count, primes)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        displayPrimes(primes, NUMBER_OF_PRIMES_PER_LINE);

    }

    public static void displayPrimes(int[] primes, int NUMBER_OF_PRIMES_PER_LINE) {
        for (int i = 0; i < primes.length; i++) {

            if (i % NUMBER_OF_PRIMES_PER_LINE == 0) {
                System.out.println();
            }
            System.out.printf("%4d " ,primes[i]);
        }
    }


    public static boolean isPrime(int number, int count, int[] primes) {
        for (int i = 0; primes[i] <= Math.sqrt(number) && i < count; i++) {
            if (number % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }


}

