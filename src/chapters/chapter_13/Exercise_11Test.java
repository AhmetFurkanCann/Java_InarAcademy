package chapters.chapter_13;

public class Exercise_11Test {
    public static void main(String[] args) {
        Exercise_11Octagon octagon = new Exercise_11Octagon(5);
        System.out.println("Area of octagon is : " + octagon.getArea() + "\nPerimeter of octagon is : " + octagon.getPerimeter());
        System.out.println("-----------------------------------------------------");
        Exercise_11Octagon octagonClone = (Exercise_11Octagon) octagon.clone() ;
        System.out.println("Area of octagon is : " + octagon.getArea() + "\nPerimeter of octagon is : " + octagon.getPerimeter());
        System.out.println("Comparison of two octagon : " + octagon.compareTo(octagonClone));
    }
}
