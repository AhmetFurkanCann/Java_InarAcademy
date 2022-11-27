package chapters.chapter_12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        ArrayList<String> list;
        double totalSalaryForAssistantProfessors = 0;
        int assistantProfessorsNumber = 0;
        double totalSalaryForAssociateProfessors = 0;
        int associateProfessorsNumber = 0;
        double totalSalaryForFullProfessors = 0;
        int fullProfessorsNumbers = 0;
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String str = input.nextLine();
                list = new ArrayList<>(Arrays.asList(str.split(" ")));
                String rank = list.get(2);
                switch (rank){
                    case "assistant" : totalSalaryForAssistantProfessors += Double.parseDouble(list.get(3));
                                       assistantProfessorsNumber++; break;
                    case "associate" : totalSalaryForAssociateProfessors += Double.parseDouble(list.get(3));
                                       associateProfessorsNumber++; break;
                    case "full"      : totalSalaryForFullProfessors +=  Double.parseDouble(list.get(3));
                                       fullProfessorsNumbers++;
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
        System.out.println("Total salary for assistant professors : "+ totalSalaryForAssistantProfessors);
        System.out.println("Total salary for associate professors : "+ totalSalaryForAssociateProfessors);
        System.out.println("Total salary for full professors : "+ totalSalaryForFullProfessors);
        System.out.println("Total salary for all faculty : " + (totalSalaryForFullProfessors + totalSalaryForAssistantProfessors + totalSalaryForAssociateProfessors));
        System.out.println("Average salary for assistant professors : "+ (totalSalaryForAssistantProfessors / assistantProfessorsNumber));
        System.out.println("Average salary for associate professors : "+ (totalSalaryForAssociateProfessors / associateProfessorsNumber));
        System.out.println("Average salary for full professors : "+ (totalSalaryForFullProfessors / fullProfessorsNumbers));
        System.out.println("Average salary for all faculty : " + ((totalSalaryForFullProfessors
                + totalSalaryForAssistantProfessors + totalSalaryForAssociateProfessors) /
                (assistantProfessorsNumber + associateProfessorsNumber + fullProfessorsNumbers)));
    }
}
