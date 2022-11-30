package chapters.chapter_13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise_04 {
    public static void main(String[] args) {
        Calendar calendar;
        if (args.length == 2){
            calendar = new GregorianCalendar((Integer.parseInt(args[0]) ) , Integer.parseInt(args[1]) - 1 , 1) ;
        } else if (args.length == 1) {
            calendar = new GregorianCalendar();
            int year = calendar.get(Calendar.YEAR);
            calendar.set(year , Integer.parseInt(args[0]) - 1 ,1);
        }
        else {
            calendar = new GregorianCalendar();
            calendar.set(Calendar.DAY_OF_MONTH  , 1);
        }
        printMonth(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH) + 1) , calendar);
    }

    private static void printMonth(int year, int month, Calendar calendar) {
        printMonthTitle(year,month);
        printMonthBody(year, month , calendar);
    }

    private static void printMonthBody(int year, int month, Calendar calendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }

        }
        System.out.println();
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println(" " + getMonthName(month)
                + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }
}
