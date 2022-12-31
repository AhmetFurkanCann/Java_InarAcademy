package chapters.chapter_09;

public class Exercise_01TestRectangle {
    public static void main(String[] args) {
        Exercise_01Rectangle rectangle1 = new Exercise_01Rectangle(4 , 40 );
        Exercise_01Rectangle rectangle2 = new Exercise_01Rectangle(3.5 , 35.9 );
        System.out.println("The width of rectangle1 : " + rectangle1.width);
        System.out.println("The height of rectangle1 : " + rectangle1.height);
        System.out.println("The area of rectangle1 : " + rectangle1.getArea());
        System.out.println("The perimeter of rectangle1 : " + rectangle1.getPerimeter());
        System.out.println("The width of rectangle2 : " + rectangle2.width);
        System.out.println("The height of rectangle2 : " + rectangle2.height);
        System.out.println("The area of rectangle2 : " + rectangle2.getArea());
        System.out.println("The perimeter of rectangle2 : " + rectangle2.getPerimeter());
    }
}
