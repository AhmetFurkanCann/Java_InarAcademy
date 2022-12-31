package weeks.week_04;

public class Palindrome {

	public static void main(String[] args) {
		String s = "hannAh";
		s = s.toLowerCase();
		boolean palindrome = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
				palindrome = false;
			}

		}
		System.out.println(" Is " + s + " palindrome :" + palindrome);
	}

}
