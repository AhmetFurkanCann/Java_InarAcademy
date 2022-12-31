package chapters.chapter_09;

import java.util.Random;

public class Exercise_04 {
    public static void main(String[] args) {
        Random x =new Random(1000) ;
        for (int i = 0; i < 50; i++) {
            System.out.println(x.nextInt(100));
        }
    }
}
