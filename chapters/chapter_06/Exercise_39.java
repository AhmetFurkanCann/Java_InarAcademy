package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2:");
        double p0x = input.nextDouble();
        double p0y = input.nextDouble();
        double p1x = input.nextDouble();
        double p1y = input.nextDouble();
        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        if (leftOfTheLine(p0x , p0y , p1x , p1y , p2x , p2y)){
            System.out.println("(" + p2x + ", " + p2y + ") is on the " + "left side of the " + "line from (" + p0x
                    + ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        } else if (onTheLineSegment(p0x , p0y , p1x , p1y , p2x , p2y)) {
            System.out.println("(" + p2x + ", " + p2y + ") is on the " + "line segment from (" + p0x+ ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }
        else if(onTheSameLine(p0x , p0y , p1x , p1y , p2x , p2y)) {
            System.out.println("(" + p2x + ", " + p2y + ") is on the same " + "line from (" + p0x+ ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }

        else {
            System.out.println("(" + p2x + ", " + p2y + ") is on the " + "right side of the " + "line from (" + p0x+ ", " + p0y + ") to (" + p1x + ", " + p1y + ")");
        }
    }

    public static boolean onTheLineSegment(double p0x, double p0y, double p1x, double p1y, double p2x, double p2y) {
        double condition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        return (!(condition > 0 || condition < 0 ||(p2x < p0x) || (p2y < p0y) || (p2x > p1x) || (p2y > p1y)) );
    }

    public static boolean onTheSameLine(double p0x, double p0y, double p1x, double p1y, double p2x, double p2y) {
        double condition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        return (condition == 0);
    }

    public static boolean leftOfTheLine(double p0x, double p0y, double p1x, double p1y, double p2x, double p2y) {
        double condition = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);
        return (condition > 0);
    }
}
