package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the points : ");
        int n = input.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter the coordinates of the points: ");
        getThePoints(list, n);
        double area = getTheArea(list, n);
        System.out.println("The total area is " + area);
    }

    private static double getTheArea(ArrayList<Double> list, int n) {
        double sum = 0;
        int indexX1 = 0;
        int indexX2 = 2;
        int indexY1 = 1;
        int indexY2 = 3;
        for (int i = 0; i < n; i++) {
            if (indexX2 == (n * 2 - 2)) {
                indexX2 = 0;
            }
            if (indexY2 == (n * 2 - 1)) {
                indexY2 = 0;
            }

            sum += Math.abs((list.get(indexX1) * list.get(indexY2)) - (list.get(indexX2) * list.get(indexY1)));
            indexX1 += 2;
            indexX2 += 2;
            indexY1 += 2;
            indexY2 += 2;
        }
        return sum / 2;
    }

    private static void getThePoints(ArrayList<Double> list, int n) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n * 2; i++) {
            list.add(input.nextDouble());
        }
    }
}
