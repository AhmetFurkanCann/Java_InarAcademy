package weeks.week_04;

public class StringPractice {

	public static void main(String[] args) {
		length();
		breakLine();
		substring();
		breakLine();
		equalsIgnoreCase();
		breakLine();
		contains();
		breakLine();
		trim();
		breakLine();
		charAt();
		breakLine();
		toLowerCase();
		breakLine();
		toUpperCase();
		

	}

	public static void length() {
		String temp = "I love Inar Academy" ;
		int length = temp.length();
		System.out.println(length);

	}
	public static void substring() {
		String temp = "Inar Academy" ;
		String yeni =		temp.substring(3, 9) ;
		System.out.println(temp);
		System.out.println(yeni);
	}
	public static void equalsIgnoreCase() {
		String temp1= "Inar" ;
		String temp2= "InAr" ;
		String temp3= "Inar Academy" ;
		System.out.println(temp1.equalsIgnoreCase(temp2));
		System.out.println(temp1.equalsIgnoreCase(temp3));
		
	}
	public static void  contains() {
		String temp1= "Inar" ;
		String temp2= "In" ;
		System.out.println(temp1.contains(temp2));
		
	}
	public static void  trim() {
		String temp1= "    Inar 	" ;
		System.out.println(temp1.trim());
		
	}
	public static void  charAt() {
		String temp1= "Inar" ;
		System.out.println(temp1.charAt(2));
		
	}
	
	public static void  toLowerCase() {
		String temp1= "InarAcademy" ;
		System.out.println(temp1.toLowerCase());
	}
	
	public static void  toUpperCase() {
		String temp1= "InarAcademy" ;
		System.out.println(temp1.toUpperCase());
	}
	public static void  breakLine() {
		System.out.println("-----------------------");
	}

}
