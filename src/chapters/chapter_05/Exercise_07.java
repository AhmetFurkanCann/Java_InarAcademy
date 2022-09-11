package chapters.chapter_05;

public class Exercise_07 {

	public static void main(String[] args) {
		double tuition = 10000;
		for (int i = 0; i < 10; i++) {
			tuition += tuition * 0.05;

		}
		System.out.println("The tuition after 10 years is : " + tuition);
		double totalCostOfFourYearsAfterTheTenthYear = 0 ;
	
		for (int i = 0; i < 4; i++) {
			tuition += tuition * 0.05;
			totalCostOfFourYearsAfterTheTenthYear += tuition;
		}
		System.out.println("The total cost of four years’ worth of tuition after the tenth year is : "
				+ totalCostOfFourYearsAfterTheTenthYear);
	}

}
