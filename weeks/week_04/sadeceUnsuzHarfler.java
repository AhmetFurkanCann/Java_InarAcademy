package weeks.week_04;

public class sadeceUnsuzHarfler {

	public static void main(String[] args) {
		String s = "Tarik";
		String result = "";
		int l = s.length();
		for (int i = 0 ; i < l ;i++) {
			char letter = s.toLowerCase().charAt(i);
			if (!(letter == 'a' ||letter == 'e' ||letter == 'i' ||letter == 'o' ||letter == 'u' )) {
				result += s.charAt(i) ;
			}
				
		}
		System.out.println(result);
	}
}
