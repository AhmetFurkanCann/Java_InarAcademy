package chapters.chapter_13;

public class Exercise_11Octagon extends Exercise_01AbstractGeometricObjectClass implements Comparable<Exercise_11Octagon>, Cloneable{
    private double side ;
    public Exercise_11Octagon() {
        this(1) ;
    }

    public Exercise_11Octagon(double side) {
        this.side = side;
    }

    public Exercise_11Octagon(String color, boolean filled, double side) {
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
        return (2 + (4 / Math.sqrt(2))) * side * side ;
    }

    @Override
    public double getPerimeter() {
        return side * 8 ;
    }

    @Override
    public int compareTo(Exercise_11Octagon o) {
        if (this.getArea() > o.getArea()){
            return 1 ;
        } else if (this.getArea() < o.getArea()) {
            return -1 ;
        }
        else {
            return 0 ;
        }
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null ;
        }
    }
}
