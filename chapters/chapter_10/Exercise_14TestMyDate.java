package chapters.chapter_10;

public class Exercise_14TestMyDate {
    public static void main(String[] args) {
        Exercise_14MyDate date1 = new Exercise_14MyDate();
        Exercise_14MyDate date2 = new Exercise_14MyDate(34355555133101L);
        System.out.println("Year date1 : " + date1.getYear());
        System.out.println("Month date1 : " + date1.getMonth());
        System.out.println("Day date1 : " + date1.getDay());
        System.out.println("Year date2 : " + date2.getYear());
        System.out.println("Month date2 : " + date2.getMonth());
        System.out.println("Day date2 : " + date2.getDay());
    }
}
