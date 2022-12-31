package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the gender: ");
        String gender = input.next();

        System.out.print("Enter the name: ");
        String name = input.next();


        ArrayList<String> list;

        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/babynameranking"+ year + ".txt");

            Scanner inp = new Scanner(url.openStream());

            while (inp.hasNext()) {
                String str = inp.nextLine();
                list = new ArrayList<>(Arrays.asList(str.split("\\s+")));

                if((gender).equalsIgnoreCase("M")){
                    if((list.get(1)).equals(name)){
                        System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                        System.exit(0);

                    }
                }else {
                    if((list.get(3)).equals(name)) {
                        System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                        System.exit(1);
                    }

                }
                list.clear();
            }

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(3);
        }
        System.out.println("The name " + name + " is not ranked in year " + year);
    }
}
