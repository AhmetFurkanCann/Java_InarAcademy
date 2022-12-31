package chapters.chapter_10;

public class Exercise_11Circle2D {
    private double x ;
    private double y ;
    private double radius ;
    public Exercise_11Circle2D() {
        this(0 , 0 , 1);
    }
    public Exercise_11Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius , 2) ;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius ;
    }
    public boolean contains (double x , double y) {
        return Math.sqrt((Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2))) < radius ;
    }
    public boolean contains (Exercise_11Circle2D circle) {
        return Math.sqrt(Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2)) <= Math.abs(radius - circle.getRadius()) ;
    }
    public boolean overlaps (Exercise_11Circle2D circle) {
        return Math.sqrt((Math.pow((x - circle.getX()), 2) + Math.pow((y - circle.getY()), 2))) <= radius + circle.getRadius() ;
    }
}
