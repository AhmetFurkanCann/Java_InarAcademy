package chapters.chapter_13;

public class Exercise_10Rectangle extends Exercise_01AbstractGeometricObjectClass implements Comparable<Exercise_10Rectangle>{
    private double width;
    private double height;

    public Exercise_10Rectangle() {
    }

    public Exercise_10Rectangle(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Exercise_10Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals (Object o) {
        return getArea() == ((Exercise_10Rectangle)o).getArea() ;
    }

    @Override
    public int compareTo(Exercise_10Rectangle o) {
        if (this.getArea() > o.getArea()){
            return 1 ;
        } else if (this.getArea() < o.getArea()) {
            return -1 ;
        }
        else {
            return 0 ;
        }
    }
}
