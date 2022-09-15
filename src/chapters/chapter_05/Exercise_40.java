package chapters.chapter_05;

public class Exercise_40 {

	public static void main(String[] args) {
		int numberOfHeads = 0 ;
		int numberOfTails = 0 ;
		for (int i= 0 ; i < 1000000 ; i++) {
			int x = (int) (Math.random()*2) ;
			if (x == 0) {
				numberOfHeads++;
			}
			else { 
				numberOfTails++;
			}
		}
		System.out.println("Flipping a coin one million times : ");
		System.out.println("number of heads : " + numberOfHeads);
		System.out.println("number of tails : " + numberOfTails);
	}

}
