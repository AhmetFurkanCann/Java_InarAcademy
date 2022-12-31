package chapters.chapter_08;

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] workHours = {
                {2 , 4 , 3 , 4 , 5 , 8 , 8},
                {7 , 3 , 4 , 3 , 3 , 4 , 4},
                {3 , 3 , 4 , 3 , 3 , 2 , 2},
                {9 , 3 , 4 , 7 , 3 , 4 , 1},
                {3 , 5 , 4 , 3 , 6 , 3 , 8},
                {3 , 4 , 4 , 6 , 3 , 4 , 4},
                {3 , 7 , 4 , 8 , 3 , 8 , 4},
                {6 ,3 , 5 , 9 , 2 , 7 , 9}};
        int [] results = new int[workHours.length];
        getSumOfWorkHours(workHours , results) ;
        displayTheWorkersInDecreasingOrder(results);
    }

    public static void displayTheWorkersInDecreasingOrder(int[] results) {
        for (int i = 0; i < results.length; i++) {
            int max = -1 ;
            int maxIndex = -1 ;
            for (int j = 0; j < results.length; j++) {
                if(results[j] > max) {
                    max = results[j];
                    maxIndex = j ;
                }
            }
            System.out.println("Worker " + maxIndex + "'s work hour is " + max);
            results[maxIndex] = -1 ;
        }
    }

    public static void getSumOfWorkHours(int[][] workHours, int[] results) {
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j] ;
            }
            results[i] = sum ;
        }
    }
}
