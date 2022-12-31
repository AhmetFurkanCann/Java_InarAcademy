package chapters.chapter_06;

public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println("i               m(i)     ");
        System.out.println("-------------------------");
        for (int i = 1; i <=20 ; i++) {
            System.out.printf("%-2d%14s%-9.4f" , i , " " , computeSeries(i));
            System.out.println();

        }
    }

    public static double computeSeries(int m) {
        double result = 0 ;
        for (double i = 1 ; i <= m ; i++) {
            result += i / (i + 1) ;
        }
        return result;

    }
}
