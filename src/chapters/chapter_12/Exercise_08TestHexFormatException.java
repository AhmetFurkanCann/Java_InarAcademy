package chapters.chapter_12;

import java.util.Scanner;

public class Exercise_08TestHexFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (Exercise_08HexFormatException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws Exercise_08HexFormatException {
        if (!isHexDigit(hex)) {
            throw new Exercise_08HexFormatException();
        }
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static boolean isHexDigit(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (Character.isDigit(hex.charAt(i))) {
                if ((hex.charAt(i) < '0') || (hex.charAt(i) > '9')) {
                    return false;
                }
            } else {
                if (hex.charAt(i) < 'A' || hex.charAt(i) > 'F') {
                    return false;
                }
            }
        }
        return true;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}

