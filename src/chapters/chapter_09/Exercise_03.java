package chapters.chapter_09;

import java.util.Date;

public class Exercise_03 {
    public static void main(String[] args) {
        Date x = new Date();
        long number = 10000;
        for (int i = 0; i < 8; i++) {
            x.setTime(number);
            System.out.println(x.toString());
            number *= 10 ;
        }
    }
}
