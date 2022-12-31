package chapters.chapter_09;

public class Exercise_06TestStopWatch {
    public static void main(String[] args) {
        double[] list = new double[100000] ;
        for (int i = 0; i < 100000; i++) {
            list[i] = Math.random() * 100 ;
        }
        Exercise_06StopWatch a = new Exercise_06StopWatch();
        selectionSort(list) ;
        a.stop();
        System.out.println("The execution time of sorting 100000 numbers " + a.getElapsedTime());
    }
    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {

            double currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
