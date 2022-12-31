package chapters.chapter_09;

import java.util.GregorianCalendar;

public class Exercise_05 {
    public static void main(String[] args) {
    GregorianCalendar x = new GregorianCalendar();
        System.out.println(x.get(GregorianCalendar.YEAR) + " " + x.get(GregorianCalendar.MONTH) + " " + x.get(GregorianCalendar.DAY_OF_MONTH));
        x.setTimeInMillis(1234567898765L);
        System.out.println(x.get(GregorianCalendar.YEAR) + " " + x.get(GregorianCalendar.MONTH) + " " + x.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
