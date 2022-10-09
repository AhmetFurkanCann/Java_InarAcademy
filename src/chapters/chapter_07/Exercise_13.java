package chapters.chapter_07;

public class Exercise_13 {
    public static void main(String[] args) {
        int randomNumber = getRandom(0,1,2,3,4,5,6,7,8,9) ;
        System.out.println("Random number = " + randomNumber);
    }
    public static int getRandom(int... numbers){
        int number ;
        boolean isContains ;
        do {
            isContains = false ;
            number = (int) (Math.random() * 54 + 1) ;
            for (int i = 0; i <numbers.length ; i++) {
                if (number == numbers[i]){
                    isContains = true ;
                }
            }
        } while (isContains) ;
        return number ;
    }
}
