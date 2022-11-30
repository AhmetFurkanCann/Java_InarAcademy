package chapters.chapter_13;

public class Exercise_07Test {
    public static void main(String[] args) {
        Exercise_05GeometricObjectClassWithComparable[] array = new Exercise_05GeometricObjectClassWithComparable[5];
        array[0] = new Exercise_05Circle(5);
        array[1] = new Exercise_05Rectangle(10 , 5);
        array[2] = new Exercise_05Circle();
        array[3] = new Exercise_07Square(5);
        array[4] = new Exercise_07Square();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of Geometric Object in the index " + i + " is : " + array[i].getArea());
            if (array[i] instanceof Exercise_07ColorableInterface){
                ((Exercise_07ColorableInterface) array[i]).howToColor();
            }
            System.out.println("-----------------------------------");
        }

    }
}
