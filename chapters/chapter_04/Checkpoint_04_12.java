package chapters.chapter_04;

public class Checkpoint_04_12 {

	public static void main(String[] args) {
		char c = 'A';
		int i = (int) c;
		System.out.println(i);
		System.out.println(c);
		float f = 1000.34f;
		i = (int) f;
		double d = 1000.34;
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		i = (int) d;
		System.out.println(i);
		i = 97;
		System.out.println(i);
		c = (char) i;
		System.out.println(c);
	}

}
