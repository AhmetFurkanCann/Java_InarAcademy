package chapters.chapter_09;

public class Exercise_09TestRegularPolygon {
    public static void main(String[] args) {
        Exercise_09RegularPolygon a1 = new Exercise_09RegularPolygon();
        System.out.println("Perimeter of a1 = " + a1.getPerimeter() + " Area of a1 = " + a1.getArea());
        Exercise_09RegularPolygon a2 = new Exercise_09RegularPolygon(6 ,4);
        System.out.println("Perimeter of a2 = " + a2.getPerimeter() + " Area of a2 = " + a2.getArea());
        Exercise_09RegularPolygon a3 = new Exercise_09RegularPolygon(10 , 4 , 5.6 , 7.8);
        System.out.println("Perimeter of a3 = " + a3.getPerimeter() + " Area of a3 = " + a3.getArea());
    }
}
