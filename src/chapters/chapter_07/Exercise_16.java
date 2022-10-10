package chapters.chapter_07;

public class Exercise_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        fillTheArray(array);
        int key = (int) (((Math.random() * 2147483647 * 2) - 2147483647));
        long startTime = System.currentTimeMillis();
        int i = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("The execution time of invoking the LinearSearch is " + executionTime);
        startTime = System.currentTimeMillis();
        java.util.Arrays.sort(array);
        i = binarySearch(array, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The execution time of invoking the BinarySearch is " + executionTime);
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }

    public static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (((Math.random() * 2147483647 * 2) - 2147483647));
        }
    }
}
