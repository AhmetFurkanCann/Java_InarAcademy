package chapters.chapter_10;

public class Exercise_04TestMayPoint {
    public static void main(String[] args) {
        Exercise_04MyPoint p1 = new Exercise_04MyPoint();
        Exercise_04MyPoint p2 = new Exercise_04MyPoint(10 , 30.5);
        System.out.println("Distance between p1 and p2 is : " + p1.distance(p2));
    }
}
