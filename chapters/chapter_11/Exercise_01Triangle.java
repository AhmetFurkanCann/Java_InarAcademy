package chapters.chapter_11;

public class Exercise_01Triangle extends Exercise_01GeometricObject {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Exercise_01Triangle() {
        this(1,1,1);
    }

    public Exercise_01Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2 ;
        double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))) ;
        return area ;
    }
    public double getPerimeter() {
        return  side1 + side2 + side3 ;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTriangle : side1 : " + side1 + "\nTriangle : side2 : " + side2 +
                "\nTriangle : side2 : " + side3;
    }
}
