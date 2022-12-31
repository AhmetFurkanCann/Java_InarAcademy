package chapters.chapter_09;

public class Exercise_01Rectangle {
    double width = 1 ;
    double height = 1 ;
    Exercise_01Rectangle(){
    }
    Exercise_01Rectangle(double width , double height){
        this.width = width ;
        this.height = height ;
    }
    double getArea(){
        return width * height ;
    }
    double getPerimeter(){
        return 2 * (width + height) ;
    }
}
