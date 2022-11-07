package chapters.chapter_10;

public class Exercise_11TestCircle2D {
    public static void main(String[] args) {
        Exercise_11Circle2D circle1 = new Exercise_11Circle2D(2,2,5.5);
        System.out.println(" Area of circle1 : " + circle1.getArea() + "\n Perimeter of circle1 : " + circle1.getPerimeter() +
        "\n circle1 contains(3,3) ? : " + circle1.contains(3,3) + "\n circle1 contains(Circle2D(4,5,10.5) ? : " + circle1.contains(new Exercise_11Circle2D(4,5,10.5))
        + "\n circle1 overlaps Circle2D(3,5,2.5) ? : " + circle1.overlaps(new Exercise_11Circle2D(3,5,2.3)));
    }
}
