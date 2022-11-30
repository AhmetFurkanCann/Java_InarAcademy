package chapters.chapter_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine() + "\"" ;
        if (isUrl(url)) {
            String s = "Computer Programming";
            crawlerToFindString(url, s);
        } else {
            System.out.println("Wrong URL!");
        }
    }

    private static boolean isUrl(String url) {
        int current = url.indexOf("http:");
        int endIndex = url.indexOf("\"", current);
        if (endIndex > 0) {
            return true;
        } else
            return false;
    }


    public static void crawlerToFindString(String startingURL, String s) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty()) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                if (urlContainsString(urlString, s)) {
                    System.out.println("String " + s + " is found in the url : " + urlString);
                    System.exit(1);
                }
                for (String url : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(url))
                        listOfPendingURLs.add(url);
                }
            }
        }
        System.out.println("Crawler could not find the string !");
    }

    private static boolean urlContainsString(String urlString, String s) {
        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.contains(s)) {
                    return true;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else
                        current = -1;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
