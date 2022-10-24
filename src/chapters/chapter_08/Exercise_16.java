package chapters.chapter_08;

public class Exercise_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        System.out.println("Before sort : ");
        displayArray(array);
        sort(array);
        System.out.println("After sort : ");
        displayArray(array);
    }

    public static void sort(int[][] array) {
        sortRow(array);
        sortColumn(array);
    }

    public static void sortColumn(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMinX = array[i][0];
            int currentMin = array[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMinX == array[j][0]  && currentMin > array[j][1]) {
                    currentMin = array[j][1];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                int tempX = array[currentMinIndex][0];
                array[currentMinIndex][0] = array[i][0];
                array[currentMinIndex][1] = array[i][1];
                array[i][1] = currentMin;
                array[i][0] = tempX;
            }
        }
    }

    public static void sortRow(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i][0];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j][0]) {
                    currentMin = array[j][0];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                int tempY = array[currentMinIndex][1];
                array[currentMinIndex][0] = array[i][0];
                array[currentMinIndex][1] = array[i][1];
                array[i][0] = currentMin;
                array[i][1] = tempY;
            }
        }
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
