package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int numberOfStudents = input.nextInt();
        String[] studentsName = new String[numberOfStudents];
        double[] studentsScores = new double[numberOfStudents];
        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("Enter student name :");
            studentsName[i] = input.next();
            System.out.println("Enter " + studentsName[i] + "'s score");
            studentsScores[i] = input.nextDouble();
        }
        displayStudentsScoresAndNamesInDecreasingOrder(studentsName, studentsScores);


    }

    public static void displayStudentsScoresAndNamesInDecreasingOrder(String[] studentsName, double[] studentsScores) {
        System.out.println("Students score in decreasing order :");
        for (int i = 0; i < studentsScores.length; i++) {
            double max = -1;
            int maxIndex = -1;
            for (int j = 0; j < studentsScores.length; j++) {
                if (studentsScores[j] >= max) {
                    max = studentsScores[j];
                    maxIndex = j;
                }
            }
            System.out.println(studentsName[maxIndex] + " : " + studentsScores[maxIndex]);
            studentsScores[maxIndex] = -1;
            max = -1;
        }
    }


}
