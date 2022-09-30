package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds :");
        long milliseconds = input.nextLong();
        System.out.println(milliseconds + " millisecond is : " + convertMillis(milliseconds));
    }
    public static String convertMillis(long totalMilliseconds) {
        long hours = totalMilliseconds / 3600000;
        totalMilliseconds = totalMilliseconds % 3600000 ;
        long minutes = totalMilliseconds / 60000;
        totalMilliseconds = totalMilliseconds % 60000 ;
        long seconds = totalMilliseconds / 1000 ;
        return hours + ":" + minutes + ":" + seconds ;

    }
}
