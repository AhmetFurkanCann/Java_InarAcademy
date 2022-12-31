package chapters.chapter_13;

public class Exercise_06Test {
    public static void main(String[] args) {
        Exercise_06ComparableCircle circle1 = new Exercise_06ComparableCircle(5);
        Exercise_06ComparableCircle circle2 = new Exercise_06ComparableCircle(10);
        int compareToResult = circle1.compareTo(circle2);
        if (compareToResult == 1) {
            System.out.println(circle1);
        } else if (compareToResult == -1) {
            System.out.println(circle2);
        }
        else {
            System.out.println("Circles are equal");
        }
    }
}
