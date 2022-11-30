package chapters.chapter_13;

public class Exercise_07Square extends Exercise_05GeometricObjectClassWithComparable implements Exercise_07ColorableInterface{
    private double side ;

    public Exercise_07Square() {
        this(0);
    }

    public Exercise_07Square(double side) {
        this.side = side;
    }

    public Exercise_07Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side ;
    }

    @Override
    public double getPerimeter() {
        return side * 4 ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
