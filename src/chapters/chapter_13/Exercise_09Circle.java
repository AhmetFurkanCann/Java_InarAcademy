package chapters.chapter_13;

public class Exercise_09Circle extends Exercise_01AbstractGeometricObjectClass implements Comparable<Exercise_09Circle>{
    private double radius;

    public Exercise_09Circle() {
    }

    public Exercise_09Circle(double radius) {
        this.radius = radius;
    }

    public Exercise_09Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }


    public double getDiameter() {
        return 2 * radius;
    }


    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
    @Override
    public boolean equals (Object o) {
        return getRadius() == ((Exercise_09Circle)o).getRadius() ;
    }

    @Override
    public int compareTo(Exercise_09Circle o) {
        if (this.getRadius() > o.getRadius()){
            return 1 ;
        } else if (this.getRadius() < o.getRadius()) {
            return -1 ;
        }
        else {
            return 0 ;
        }
    }
}

