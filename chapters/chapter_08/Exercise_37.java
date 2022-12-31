package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_37 {
    public static void main(String[] args) {
        String[][] capitals = new String[50][2];
        getStatesAndCapitals(capitals);
        playTheGame(capitals);
    }

    public static void playTheGame(String[][] capitals) {
        Scanner input = new Scanner(System.in);
        int count = 0 ;
        for (int i = 0; i < capitals.length; i++) {
            System.out.println("What is the capital of " + capitals[i][0]);
            String s = input.nextLine();
            if (s.equalsIgnoreCase(capitals[i][1])){
                System.out.println("Your answer is correct ");
                count++;
            }
            else {
                System.out.println("The correct answer should be " + capitals[i][1]);
            }
        }
        System.out.println("The correct count is " + count);
    }

    public static void getStatesAndCapitals(String[][] capitals) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter states and its capital with one space between (e.x : Alabama Montgomery");
        for (int i = 0; i < capitals.length; i++) {
            for (int j = 0; j < capitals[0].length; j++) {
                capitals[i][j] = input.nextLine();
            }
        }
    }
}
