package chapters.chapter_13;

public class Exercise_06ComparableCircle extends Exercise_06Circle implements Comparable<Exercise_06ComparableCircle>{
    public Exercise_06ComparableCircle() {
        this(0);
    }

    public Exercise_06ComparableCircle(double r) {
        super(r);
    }

    @Override
    public int compareTo(Exercise_06ComparableCircle o) {
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Comparable Circle : "+ super.toString() ;
    }
}
