package chapters.chapter_13;

public class Exercise_12 {
    public static void main(String[] args) {
        Exercise_01AbstractGeometricObjectClass[] array = { new Exercise_09Circle(2) , new Exercise_09Circle(5),
        new Exercise_10Rectangle(2,5) , new Exercise_10Rectangle(5,2)} ;
        System.out.println("Sum of Geometric Objects : " + sumArea(array));
    }

    private static double sumArea(Exercise_01AbstractGeometricObjectClass[] array) {
        double sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum ;
    }
}
