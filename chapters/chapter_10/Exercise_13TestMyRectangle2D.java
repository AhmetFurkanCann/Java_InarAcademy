package chapters.chapter_10;

public class Exercise_13TestMyRectangle2D {
    public static void main(String[] args) {
        Exercise_13MyRectangle2D r1 = new Exercise_13MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area : " + r1.getArea());
        System.out.println("Perimeter : " + r1.getPerimeter());
        System.out.println("r1 contains (3.3) ? : " + r1.contains(3, 3));
        System.out.println("r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)) ? : " + r1.contains(new Exercise_13MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? : " + r1.overlaps(new Exercise_13MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}

