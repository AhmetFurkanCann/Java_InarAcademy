package chapters.chapter_13;

public class Exercise_05Test {
    public static void main(String[] args) {
        Exercise_05GeometricObjectClassWithComparable circle1 = new Exercise_05Circle(2);
        Exercise_05GeometricObjectClassWithComparable circle2 = new Exercise_05Circle(3);

        Exercise_05GeometricObjectClassWithComparable rectangle1 = new Exercise_05Rectangle(5,5);
        Exercise_05GeometricObjectClassWithComparable rectangle2 = new Exercise_05Rectangle(3 , 3);

        System.out.println("Max of two circles : " + Exercise_05GeometricObjectClassWithComparable.max(circle1,circle2));
        System.out.println("Max of two rectangles : " + Exercise_05GeometricObjectClassWithComparable.max(rectangle1,rectangle2));
    }
}
