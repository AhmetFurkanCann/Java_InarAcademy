package chapters.chapter_06;

public class Exercise_09 {
    public static void main(String[] args) {
        System.out.println("Feet      Meters      |      Meters      Feet");
        for (double i = 1 , j = 20 ; i <= 10 && j <= 65 ; i++ , j += 5) {
            System.out.printf("%-4.1f%6s%-6.3f%6s|%6s%-6.1f%6s%-7.3f" , i , " " , footToMeter(i) , " " , " " , j , " " , meterToFoot(j));
            System.out.println();
        }
    }
    public static double footToMeter(double foot){
        return 0.305 * foot ;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter ;
    }
}
