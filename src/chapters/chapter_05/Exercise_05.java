package chapters.chapter_05;

public class Exercise_05 {

	public static void main(String[] args) {
		System.out.println("Kilograms           Pounds       |       Pounds           Kilograms");
		for (int i = 1 , j = 20; i < 200 && j < 516; i= i + 2 , j = j + 5) {
			System.out.printf("%-9d%17.1f", i, (i * 2.2));
			System.out.print("       |       ");
			System.out.printf("%-6d%20.2f", j, (j / 2.2));
			System.out.println();
			
			
		}
	}

}
