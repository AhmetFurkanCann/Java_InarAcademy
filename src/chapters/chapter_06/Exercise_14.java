package chapters.chapter_06;

public class Exercise_14 {
    public static void main(String[] args) {
        System.out.println("i              m(i)    ");
        System.out.println("-----------------------");
        for (int i = 1; i <=901 ; i+=100) {
            System.out.printf("%-3d%12s%-8.4f" , i , " " , estimatePi(i) );
            System.out.println();
        }
    }

    public static double estimatePi(int i) {
        double sum = 1 ;
        for (int k = 3 , j = 1; k <= (2 * i - 1 ) ; k +=2 , j++) {
            sum += Math.pow(-1, j) * 1 / k ;
        }
        return 4 * sum ;
    }
}
