package chapters.ArrayListQuestions;

import java.util.*;

public class Exercise_08_26 {
    public static void main(String[] args) {
        List<List<Double>> listOfArrayLists = new ArrayList<List<Double>>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            listOfArrayLists.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                (listOfArrayLists.get(i)).add(input.nextDouble());
            }
        }
        sortTheRows(listOfArrayLists);
        displayRowSortedMatrix(listOfArrayLists);
    }

    private static void displayRowSortedMatrix(List<List<Double>> listOfArrayLists) {
        System.out.println("The row-sorted array is ");
        for (int i = 0; i < listOfArrayLists.size(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((listOfArrayLists.get(i)).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void sortTheRows(List<List<Double>> listOfArrayLists) {
        for (int i = 0; i < listOfArrayLists.size(); i++){
            Collections.sort(listOfArrayLists.get(i));
        }
    }
}
