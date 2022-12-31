package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of students :");
		int numberOfStudents= input.nextInt();
		String highestStudent = "" ;
		double highestScore = 0 ;
		for (int i = 0 ; i < numberOfStudents ; i++) {
			System.out.println("Enter Student's name : ");
			String s = input.next();
			System.out.println("Enter " + s + "'s score");
			double score=input.nextDouble();
			if (score > highestScore) {
				highestScore = score ;
				highestStudent = s ;
				
			}
		}
		System.out.println("Student with the highest score is " + highestStudent + " and score : " + highestScore);
		
	}

}
