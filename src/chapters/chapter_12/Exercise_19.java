package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt" ;
        try {
            java.net.URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream()) ;
            while (input.hasNext()){
                String word = input.next();
                if(isLetter(word)){
                    count++;
                }
            }
            System.out.println("The words number in the file is : " + count);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isLetter(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))){
                return false;
            }
        }
        return true ;
    }
}
