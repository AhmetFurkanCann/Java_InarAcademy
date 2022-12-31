package chapters.chapter_06;

public class Exercise_38 {
    public static void main(String[] args) {
        int count = 1 ;
        for (int i = 0; i < 100 ; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (count % 10 == 0){
                System.out.println();
            }
            count++;
        }
        System.out.println("-------------------");
       count = 1 ;
        for (int i = 0; i < 100 ; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (count % 10 == 0){
                System.out.println();
            }
            count++;
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }


    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }


    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }


    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
