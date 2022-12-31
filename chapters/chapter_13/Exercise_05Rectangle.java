package chapters.chapter_13;

public class Exercise_05Rectangle extends Exercise_05GeometricObjectClassWithComparable {
    double width = 1 ;
    double height = 1 ;
    Exercise_05Rectangle(){
    }
    Exercise_05Rectangle(double width , double height){
        this.width = width ;
        this.height = height ;
    }
    public double getArea(){
        return width * height ;
    }
    public double getPerimeter(){
        return 2 * (width + height) ;
    }
}
