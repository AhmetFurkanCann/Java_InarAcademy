package chapters.chapter_10;

public class Exercise_04MyPoint {
    private double x ;
    private double y ;

    public Exercise_04MyPoint() {
        this(0 , 0);
    }
    public Exercise_04MyPoint(double x , double y) {
        this.x = x ;
        this.y = y ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance (Exercise_04MyPoint point) {
        return distance(point.getX(), point.getY()) ;
    }
    public double distance (double x , double y) {
        return Math.sqrt(Math.pow((this.x - x) ,2) + Math.pow((this.y - y) ,2));
    }
    public static double distance (Exercise_04MyPoint point1 , Exercise_04MyPoint point2) {
        return Math.sqrt(Math.pow((point1.getX() - point2.getX()) ,2) + Math.pow((point1.getY() - point2.getY()) ,2));
    }

}
