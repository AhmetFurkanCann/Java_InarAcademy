package chapters.chapter_08;

public class Exercise_10 {
    public static void main(String[] args) {
        int [][] matrix = new int[4][4];
        initializeMatrixWithRandomValues(matrix);
        displayRandomMatrix(matrix);
        System.out.println("The largest row index: " + maxRow(matrix));
        System.out.println("The largest column index: " + maxColumn(matrix));
    }

    public static int maxColumn(int[][] matrix) {
        int index = -1;
        int max = Integer.MIN_VALUE ;
        int total = 0;
        for (int i = 0; i < matrix[0].length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[j][i];
            }
            if(total > max){
                max = total ;
                index = i ;
            }
            total = 0;
        }
        return index ;
    }

    public static int maxRow(int[][] matrix) {
        int index = -1;
        int max = Integer.MIN_VALUE ;
        int total = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                total += matrix[i][j];
            }
            if(total > max){
                max = total ;
                index = i ;
            }
            total = 0;
        }
        return index ;
    }

    public static void displayRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void initializeMatrixWithRandomValues(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
    }
}
