package chapters.chapter_05;

public class Exercise_04 {

	public static void main(String[] args) {
		System.out.println("Miles           Kilometers");
		for (int i = 1; i < 11; i++) {
			System.out.printf("%-5d%11s%-10.3f", i," " ,(i * 1.609));
			System.out.println();
		}
	}

}
