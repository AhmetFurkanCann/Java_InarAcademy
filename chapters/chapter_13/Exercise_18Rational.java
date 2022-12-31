package chapters.chapter_13;

public class Exercise_18Rational {
    public static void main(String[] args) {
        Exercise_14Rational number ;
        Exercise_14Rational sum = new Exercise_14Rational();
        for (int i = 1; i <= 99 ; i++) {
            number = new Exercise_14Rational(i , i+1) ;
            sum.add(number);
        }
        System.out.println("Result is : " + sum.toString());
    }
}
