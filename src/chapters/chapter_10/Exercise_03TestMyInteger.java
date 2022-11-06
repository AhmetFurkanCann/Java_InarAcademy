package chapters.chapter_10;

public class Exercise_03TestMyInteger {
    public static void main(String[] args) {
        Exercise_03MyInteger object1 = new Exercise_03MyInteger(4);
        Exercise_03MyInteger object2 = new Exercise_03MyInteger(5);
        int number1 = object1.getValue();
        int number2 = object2.getValue();
        System.out.println("Object 1 : " + number1);
        System.out.println("Object 2 : " + number2);
        System.out.println("Object1" + " isEven ? : " + object1.isEven() + " isOdd ? : " + object1.isOdd() + " is Prime ? : " + object1.isPrime());
        System.out.println("4 is Even ? : " + Exercise_03MyInteger.isEven(4) + " 4 is Odd ? : " + Exercise_03MyInteger.isOdd(4) + " 4 is Prime ? : " + Exercise_03MyInteger.isPrime(4));
        System.out.println("Object2" + " isEven ? : " + object2.isEven() + " isOdd ? : " + object2.isOdd() + " is Prime ? : " + object2.isPrime());
        System.out.println("Object1 is equal with 2 ? : " + object1.equals(2) + " Object1 is equal with Object2 ? :" + object1.equals(object2));
        char[] charArray = {'1' , '2' , '3'} ;
        int number3 = Exercise_03MyInteger.parseInt(charArray);
        System.out.println(number3);
        String s = "123" ;
        int number4 = Exercise_03MyInteger.parseInt(s);
        System.out.println(number4);
    }
}
