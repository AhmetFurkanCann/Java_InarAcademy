package chapters.chapter_06;

public class Exercise_08 {
    public static void main(String[] args) {
        System.out.println("Celsius      Fahrenheit      |      Fahrenheit      Celsius");
        for (int i = 40 , j = 120 ; i > 30 && j >= 30 ; i-- , j -= 10) {
            System.out.printf("%-7d%6s%-10.1f%6s|%6s%-10d%6s%-7.2f" , i , " " , celsiusToFahrenheit(i) , " " , " " , j , " " , fahrenheitToCelsius(j));
            System.out.println();
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32 ;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32) ;
    }
}
