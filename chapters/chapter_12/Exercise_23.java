package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0 ;
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                sum += Double.parseDouble(input.next());
                count++;
            }

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(3);
        }
        System.out.println("Total of scores : " + sum + " Average of scores : " + (sum / count));
    }
}
