package chapters.chapter_08;

public class Exercise_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        fillTheMatrixWithRandomValues(matrix);
        displayMatrix(matrix);
        if(rowControl(matrix) && columnControl(matrix)){
            System.out.println("Every row and every column have an even number of 1s");
        }
        else {
            System.out.println("Every row and every column have not an even number of 1s");
        }
    }

    public static boolean columnControl(int[][] matrix) {
        boolean result = true ;
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1){
                    count++;
                }
            }
            if (count % 2 != 0) {
                result = false ;
                break;
            }
        }
        return result;
    }

    public static boolean rowControl(int[][] matrix) {
        boolean result = true ;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1){
                    count++;
                }
            }
            if (count % 2 != 0) {
                result = false ;
                break;
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
    }

    public static void fillTheMatrixWithRandomValues(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2) ;
            }
        }
    }
}
