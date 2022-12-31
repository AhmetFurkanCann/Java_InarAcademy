package chapters.chapter_10;

public class Exercise_06 {
    public static void main(String[] args) {
        Exercise_05StackOfIntegers stack = new Exercise_05StackOfIntegers() ;
        int number = 2 ;
        while (number <= 120) {
            if (isPrime(number)){
                stack.push(number);
            }
            number++;
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2 ; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true ;
    }
}
