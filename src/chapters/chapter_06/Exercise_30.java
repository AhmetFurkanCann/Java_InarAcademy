package chapters.chapter_06;

public class Exercise_30 {
    public static void main(String[] args) {
                int dieOne = rollDice();
                int dieTwo = rollDice();
                System.out.println("You rolled " + dieOne + " + " + dieTwo + " = " + (dieOne + dieTwo));
                if (dieOne + dieTwo == 2 || dieOne + dieTwo == 3 || dieOne + dieTwo == 12) {
                    System.out.println("You win");

                } else if (dieOne + dieTwo == 7 || dieOne + dieTwo == 11) {
                    System.out.println("You lose");

                } else {
                    rollDiceUntilWinOrLose(dieOne, dieTwo);
                }

    }

    public static void rollDiceUntilWinOrLose(int dieOne, int dieTwo) {
        int point = dieOne + dieTwo;
        System.out.println("Point is " + point);
        int number1;
        int number2;
        do {
            number1 = rollDice();
            number2 = rollDice();
            System.out.println("You rolled " +  number1 + " + " + number2 + " = " + (number1 + number2));
        } while (number1 + number2 != point && number1 + number2 != 7);
        if((number1 + number2 == point)){
            System.out.println( "You win");

        }
        else {
            System.out.println("You lose");

        }

    }

    public static int rollDice() {
        return (int) (Math.random() * 5) + 1 ;
    }
}
