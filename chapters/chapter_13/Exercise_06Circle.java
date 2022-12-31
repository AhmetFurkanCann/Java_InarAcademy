package chapters.chapter_13;

public class Exercise_06Circle {
    String color;
    double radius;
    private double area;
    private double perimeter;
    boolean isFilled;
    public Exercise_06Circle() {
        color = "RED";
        radius = 2;
        isFilled = false;

    }

    public Exercise_06Circle(double r) {
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

    public String toString() {
        return "radius :" + radius + "\nperimeter :" + getPerimeter() + "\narea :" + getArea() + "\nisFilled :" + isFilled + "\ncolor :" + color ;

    }
}
