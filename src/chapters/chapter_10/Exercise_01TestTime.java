package chapters.chapter_10;

public class Exercise_01TestTime {
    public static void main(String[] args) {
        Exercise_01Time time1 = new Exercise_01Time();
        Exercise_01Time time2 = new Exercise_01Time(555550000);
        Exercise_01Time time3 = new Exercise_01Time(5 , 23 , 55);
        System.out.println("Time of time1 " + time1.getHour() + " : " + time1.getMinute() + " : " + time1.getSecond());
        System.out.println("Time of time2 " + time2.getHour() + " : " + time2.getMinute() + " : " + time2.getSecond());
        System.out.println("Time of time3 " + time3.getHour() + " : " + time3.getMinute() + " : " + time3.getSecond());

    }
}
