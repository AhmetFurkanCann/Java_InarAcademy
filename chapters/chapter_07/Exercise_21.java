package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the balls : ");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter number of the slots : ");
        int numberOfSlots = input.nextInt();
        String[] ballPath = new String[numberOfBalls];
        getBallPath(ballPath , numberOfSlots);
        displayBallPath(ballPath);
        int[] slots = new int[numberOfSlots];
        getBallFallsIntoASlots(ballPath, slots);
        displaySlots(slots , numberOfBalls);
    }

    public static void displaySlots(int[] slots , int numberOfBalls) {
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 0 ; j < slots.length ; j++) {
                if (slots[j] == i){
                    System.out.print("O");
                    slots[j]--;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < slots.length; i++) {
            System.out.print(i);
        }
    }

    public static void getBallFallsIntoASlots(String[] ballPath, int[] slots) {
        for (int i = 0; i < ballPath.length; i++) {
            int numberOfR = countNumberOfR(ballPath[i]);
            slots[numberOfR]++;
        }
    }

    public static int countNumberOfR(String s) {
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R'){
                count++;
            }
        }
        return count;
    }

    public static void displayBallPath(String[] ballPath) {
        for (int i = 0; i < ballPath.length; i++) {
            System.out.println(ballPath[i]);
        }
    }

    public static void getBallPath(String[] ballPath , int numberOfSlots) {
        for (int i = 0; i < ballPath.length; i++) {
            String path = "";
            for (int j = 0; j < numberOfSlots - 1; j++) {
                int randomNumber = (int) (Math.random() * 2) ;
                path += (randomNumber == 0) ? "R" : "L" ;
            }
            ballPath[i]= path;
        }
    }
}
