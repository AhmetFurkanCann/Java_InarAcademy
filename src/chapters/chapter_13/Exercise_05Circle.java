package chapters.chapter_13;

public class Exercise_05Circle extends Exercise_05GeometricObjectClassWithComparable {
    String color;
    double radius;
    private double area;
    private double perimeter;
    boolean isFilled;
    public Exercise_05Circle() {
        color = "RED";
        radius = 2;
        isFilled = false;

    }

    public Exercise_05Circle(double r) {
        this();
        radius = r;
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void fillTheCircle() {
        isFilled = true;
    }

    public void cleanTheCircle() {
        isFilled = false;
    }

    public void paint(String c) {
        color = c;
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("radius :" + radius);
        System.out.println("perimeter :" + getPerimeter());
        System.out.println("area :" + getArea());
        System.out.println("isFilled :" + isFilled);
        System.out.println("color :" + color);
        System.out.println("-------------");
    }
}
