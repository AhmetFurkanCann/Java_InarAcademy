package chapters.chapter_10;

public class Exercise_12Triangle2D {
    private Exercise_04MyPoint p1 ;
    private Exercise_04MyPoint p2 ;
    private Exercise_04MyPoint p3 ;

    public Exercise_12Triangle2D() {
        this(new Exercise_04MyPoint(0,0) , new Exercise_04MyPoint(1,1) , new Exercise_04MyPoint(2,5)) ;
    }

    public Exercise_12Triangle2D(Exercise_04MyPoint p1, Exercise_04MyPoint p2, Exercise_04MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Exercise_04MyPoint getP1() {
        return p1;
    }

    public Exercise_04MyPoint getP2() {
        return p2;
    }

    public Exercise_04MyPoint getP3() {
        return p3;
    }

    public void setP1(Exercise_04MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(Exercise_04MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(Exercise_04MyPoint p3) {
        this.p3 = p3;
    }
    public double getArea() {
        double s = (p1.distance(p2) + p2.distance(p3) +  p3.distance(p1)) / 2.0 ;
        double area = Math.sqrt((s * (s - p1.distance(p2)) * (s - p2.distance(p3)) * (s - p3.distance(p1)))) ;
        return area ;
    }
    public double getPerimeter() {
        return (p1.distance(p2) + p2.distance(p3) +  p3.distance(p1)) ;
    }
    public boolean contains (Exercise_04MyPoint p) {
        Exercise_04MyPoint temp1 = p1 ;
        Exercise_04MyPoint temp2 = p2 ;
        Exercise_04MyPoint temp3 = p3 ;
        p1 = p ;
        double area1 = getArea();
        p1 = temp1;
        p2 = p ;
        double area2 = getArea();
        p2 = temp2;
        p3 = p ;
        double area3 = getArea();
        p3 = temp3;
        double area = getArea() ;
        return area1 + area2 + area3 == area ;
    }
    public boolean contains (Exercise_12Triangle2D t) {
        Exercise_04MyPoint t1 = t.getP1();
        Exercise_04MyPoint t2 = t.getP2();
        Exercise_04MyPoint t3 = t.getP3();
        return contains(t1) && contains(t2) && contains(t3) ;
    }
    public boolean overlaps (Exercise_12Triangle2D t) {
        Exercise_04MyPoint t1 = t.getP1();
        Exercise_04MyPoint t2 = t.getP2();
        Exercise_04MyPoint t3 = t.getP3();
        return intersect(t1,t2,p1,p2) || intersect(t1,t2,p1,p3) || intersect(t1,t2,p2,p3) || intersect(t1,t3,p1,p2) ||
                intersect(t1,t3,p1,p3) || intersect(t1,t3,p2,p3) || intersect(t2,t3,p1,p2) || intersect(t2,t3,p1,p1) ||
                intersect(t2,t3,p2,p3) ;
     }
     public static boolean intersect (Exercise_04MyPoint p1 , Exercise_04MyPoint p2 , Exercise_04MyPoint p3 , Exercise_04MyPoint p4) {
        double a = p1.getY() - p2.getY();
        double b = -p1.getX() + p2.getX();
        double c = p3.getY() - p4.getY();
        double d = -p3.getX() + p4.getX();
        return (a * d - b * c) > 0 ;
     }
}
