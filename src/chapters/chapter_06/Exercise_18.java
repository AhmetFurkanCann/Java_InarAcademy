package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = input.nextLine();
        System.out.println((isValid(password) ? "Valid Password" : "Invalid Password"));
    }

    public static boolean isValid(String password) {
        if (password.length() < 8 ){
            return false;
        }
        else {
            int count = 0 ;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if(!Character.isDigit(ch) && !Character.isLetter(ch)){
                    return false;
                }
                else {
                    if(Character.isDigit(ch)){
                        count++;
                    }
                }
            }
            if (count < 2 ) {
                return false;
            }

        }
        return true ;
    }
}
