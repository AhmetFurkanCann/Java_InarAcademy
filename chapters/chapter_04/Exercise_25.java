package chapters.chapter_04;

public class Exercise_25 {

	public static void main(String[] args) {
		int letter1 = (int) (Math.random() * 26 + 65 );
		int letter2 = (int) (Math.random() * 26 + 65 );
		int letter3 = (int) (Math.random() * 26 + 65 );
		int number1 = (int) (Math.random() * 10 );
		int number2 = (int) (Math.random() * 10 );
		int number3 = (int) (Math.random() * 10 );
		int number4 = (int) (Math.random() * 10 );
		System.out.println("Plate number is : " + (char) letter1 + "" + (char) letter2 + "" + (char) letter3 + "" + number1 + "" + number2 + "" + number3  );
		
	}

}
