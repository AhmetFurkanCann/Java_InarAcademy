package chapters.chapter_06;

public class Exercise_16 {
    public static void main(String[] args) {
        for (int i = 2000; i <=2020 ; i++) {
            System.out.println("Number of days in " + i + " : " + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 366 : 365 ;
    }
}
