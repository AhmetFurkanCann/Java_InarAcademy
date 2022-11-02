package chapters.chapter_09;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2 , y2 , x3 , y3 , x4 , y4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        Exercise_11LinearEquation a = new Exercise_11LinearEquation((y1 - y2) , (-x1 + x2) , (y3 - y4) , (-x3 + x4) , ((y1 - y2) * x1 - (x1 - x2) * y1) ,((y3 - y4) * x3 - (x3 - x4) * y3) ) ;
        if (a.isSolvable()){
            System.out.println("The intersecting point is X : " + a.getX() + " Y = " + a.getY());
        }
        else {
            System.out.println("Two line segments are parallel");
        }
    }
}
