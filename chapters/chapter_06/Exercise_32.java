package chapters.chapter_06;

public class Exercise_32 {
    public static void main(String[] args) {
        int count = 0;
        int win = 0;
        int lose = 0;
        while (count < 10000) {
            int dieOne = rollDice();
            int dieTwo = rollDice();
            System.out.println("You rolled " + dieOne + " + " + dieTwo + " = " + (dieOne + dieTwo));
            if (dieOne + dieTwo == 2 || dieOne + dieTwo == 3 || dieOne + dieTwo == 12) {
                System.out.println("You win");
                win++;
            } else if (dieOne + dieTwo == 7 || dieOne + dieTwo == 11) {
                System.out.println("You lose");
                lose++;
            } else {
                boolean isWin = rollDiceUntilWinOrLose(dieOne, dieTwo);
                if (isWin) {
                    win++;
                } else {
                    lose++;
                }
            }
            count++;
        }
        System.out.println("After 10000 games , win = " + win + " lose = " + lose);
    }

    public static boolean rollDiceUntilWinOrLose(int dieOne, int dieTwo) {
        int point = dieOne + dieTwo;
        System.out.println("Point is " + point);
        int number1;
        int number2;
        do {
            number1 = rollDice();
            number2 = rollDice();
            System.out.println("You rolled " + number1 + " + " + number2 + " = " + (number1 + number2));
        } while (number1 + number2 != point && number1 + number2 != 7);
        if ((number1 + number2 == point)) {
            System.out.println("You win");
            return true;
        } else {
            System.out.println("You lose");
            return false;
        }

    }

    public static int rollDice() {
        return (int) (Math.random() * 5) + 1;
    }
}

