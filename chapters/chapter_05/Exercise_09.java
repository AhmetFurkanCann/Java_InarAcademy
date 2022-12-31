package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students :");
		int numberOfStudents = input.nextInt();
		if (numberOfStudents == 0 ) {
			System.out.println("You must enter at least one student");
			System.exit(0);
		}
		String highestStudent = "";
		double highestScore = 0;
		String secondHighestStudent = "";
		double secondHighestScore = 0;
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter Student's name : ");
			String s = input.next();
			System.out.println("Enter " + s + "'s score");
			double score=input.nextDouble();
			if (score < highestScore && score >= secondHighestScore) {
				secondHighestStudent = s ;
				secondHighestScore = score ;
			}
			if (score >= highestScore) {
				secondHighestStudent = highestStudent ;
				secondHighestScore = highestScore ;
				highestStudent = s ;
				highestScore = score ;
				
			}
		}
		System.out.println("Student with the highest score is " + highestStudent + " and score : " + highestScore);
		System.out.println("Student with the second score is " + secondHighestStudent + " and score : " + secondHighestScore);

	}
}
