package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        int[] students = new int[numberOfStudents];
        System.out.println("Enter 4 scores:");
        for (int i = 0; i < students.length; i++) {
            students[i]= input.nextInt();
        }
        int best = getBest(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student  "+ i + " score is " + students[i] + " and grade is " + getGrade(students[i] , best));
        }

    }

    public static String getGrade(int grade, int best) {
        if (grade > (best - 10)) {
            return "A";
        }
        else if (grade >= (best - 20)){
            return "B";
        }
        else if (grade >= (best - 30)) {
            return "C";
        }
        else if (grade >= (best - 40)) {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static int getBest(int[] students) {
        int best = students[0];
        for (int i = 1; i <students.length ; i++) {
            if (students[i] > best){
                best = students[i];
            }
        }
        return best ;
    }
}
