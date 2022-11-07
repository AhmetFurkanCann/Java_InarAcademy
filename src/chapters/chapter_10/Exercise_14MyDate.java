package chapters.chapter_10;

import java.util.GregorianCalendar;

public class Exercise_14MyDate {
    private long year ;
    private long month ;
    private long day ;
    public Exercise_14MyDate() {
        GregorianCalendar currentDay = new GregorianCalendar() ;
        this.year = currentDay.get(GregorianCalendar.YEAR);
        this.month = currentDay.get(GregorianCalendar.MONTH) ;
        this.day = currentDay.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public Exercise_14MyDate(long elapsedTime) {
        GregorianCalendar currentDay = new GregorianCalendar() ;
        currentDay.setTimeInMillis(elapsedTime);
        this.year = currentDay.get(GregorianCalendar.YEAR);
        this.month = currentDay.get(GregorianCalendar.MONTH) ;
        this.day = currentDay.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public Exercise_14MyDate(long year , long month , long day) {
        this.year = year ;
        this.month = month ;
        this.day = day ;
    }

    public long getYear() {
        return year;
    }

    public long getMonth() {
        return month;
    }

    public long getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar currentDay = new GregorianCalendar() ;
        currentDay.setTimeInMillis(elapsedTime);
        this.year = currentDay.get(GregorianCalendar.YEAR);
        this.month = currentDay.get(GregorianCalendar.MONTH) ;
        this.day = currentDay.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
