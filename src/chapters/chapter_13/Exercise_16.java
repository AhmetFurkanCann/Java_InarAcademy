package chapters.chapter_13;

public class Exercise_16 {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage java Calculator operand1 operator operand2 ");
            System.exit(1);
        }
        Exercise_14Rational number1 = new Exercise_14Rational(args[0].charAt(0) , args[0].charAt(2));
        Exercise_14Rational number2 = new Exercise_14Rational(args[2].charAt(0) , args[2].charAt(2));
        Exercise_14Rational result = new Exercise_14Rational();
        switch (args[1].charAt(0)){
            case '+' : result = number1.add(number2) ;break;
            case '-' : result = number1.subtract(number2) ; break;
            case '.' : result = number1.multiply(number2) ; break;
            case '/' : result = number1.divide(number2) ;
        }
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result.toString());
    }
}
