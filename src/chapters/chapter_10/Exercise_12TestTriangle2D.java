package chapters.chapter_10;

public class Exercise_12TestTriangle2D {
    public static void main(String[] args) {
        Exercise_12Triangle2D t1 = new Exercise_12Triangle2D(new Exercise_04MyPoint(2.5,2), new Exercise_04MyPoint(4.2,3) , new Exercise_04MyPoint(5,3.5)) ;
        System.out.println("Area : " + t1.getArea());
        System.out.println("Perimeter : " + t1.getPerimeter());
        System.out.println("t1 contains (3.3) ? : " + t1.contains(new Exercise_04MyPoint(3,3)));
        System.out.println("t1 contains (new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))) ? : " + t1.contains(new Exercise_12Triangle2D(new Exercise_04MyPoint(2.9, 2), new Exercise_04MyPoint(4, 1), new Exercise_04MyPoint(1, 3.4))));
        System.out.println("t1 overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,-3), MyPoint(2, 6.5))) ? : " + t1.overlaps(new Exercise_12Triangle2D(new Exercise_04MyPoint(2, 5.5), new Exercise_04MyPoint(4, -3), new Exercise_04MyPoint(2, 6.5))));
    }
}
