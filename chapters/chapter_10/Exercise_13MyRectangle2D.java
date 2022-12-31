package chapters.chapter_10;

public class Exercise_13MyRectangle2D {
    private double x ;
    private double y ;
    private double width ;
    private double height ;

    public Exercise_13MyRectangle2D() {
        this(0 , 0 , 1 , 1);
    }

    public Exercise_13MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height ;
    }
    public double getPerimeter() {
        return 2 * (width + height) ;
    }
    public boolean contains(double x , double y) {
        return x > (this.x - width / 2.0) &&
                x < (this.x + width / 2.0) &&
                y > (this.y - height / 2.0) &&
                y < (this.y + height / 2.0) ;
    }
    public boolean contains(Exercise_13MyRectangle2D r) {
        double x1 = r.getX() + r.getWidth() / 2.0 ;
        double x2 = r.getX() - r.getWidth() / 2.0 ;
        double y1 = r.getY() + r.getHeight() / 2.0 ;
        double y2 = r.getY() - r.getHeight() / 2.0 ;
        return x1 > (this.x - width / 2.0) && x1 < (this.x + width / 2.0) &&
                x2 > (this.x - width / 2.0) && x1 < (this.x + width / 2.0) &&
                y1 > (this.y - height / 2.0) && y1 < (this.y + height / 2.0) &&
                y2 > (this.y - height / 2.0) && y2 < (this.y + height / 2.0) ;
    }
    public boolean overlaps (Exercise_13MyRectangle2D r) {
        double x1 = r.getX() + r.getWidth() / 2.0 ;
        double x2 = r.getX() - r.getWidth() / 2.0 ;
        double y1 = r.getY() + r.getHeight() / 2.0 ;
        double y2 = r.getY() - r.getHeight() / 2.0 ;
        return !contains(r) && (x1 > (this.x - width / 2.0) && x1 < (this.x + width / 2.0)) ||
                (x2 > (this.x - width / 2.0) && x1 < (this.x + width / 2.0)) ||
                (y1 > (this.y - height / 2.0) && y1 < (this.y + height / 2.0)) ||
                (y2 > (this.y - height / 2.0) && y2 < (this.y + height / 2.0)) ;
    }
}
