package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a binary number : ");
            String binaryString = input.nextLine();
            System.out.println("The decimal value for binary number "
                    + binaryString + " is " + bin2Dec(binaryString));
        }
        catch (NumberFormatException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static int bin2Dec(String binaryString) throws NumberFormatException {
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new NumberFormatException("Illegal binary number ! ") ;
            }
        }
        int result = 0;
        int pow = 0;
        for (int i = binaryString.length() - 1 ; i >= 0 ; i--) {
            int number = Integer.parseInt(String.valueOf(binaryString.charAt(i)));
            result += Math.pow(2 , pow) * number ;
            pow++;
        }
        return result ;
    }
}
