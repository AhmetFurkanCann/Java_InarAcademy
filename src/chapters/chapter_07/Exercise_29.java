package chapters.chapter_07;

public class Exercise_29 {
    public static void main(String[] args) {
        String[] deck = new String[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        initializeTheCards(deck, suits, ranks);
        shuffleTheCards(deck);
        pickFourCardUntilYieldsTheSumOf24(deck);
    }

    public static void pickFourCardUntilYieldsTheSumOf24(String[] deck) {
        int sum ;
        int count = 0;
        String[] pickedCards ;
        do {
            pickedCards = new String[4];
            sum = 0;
            for (int i = 0; i < 4; i++) {
                int card = (int) (Math.random() * 52);
                sum += getCardsValue(deck[card]);
                pickedCards[i] = deck[card];
                count++;
            }
        }while(sum != 24);
        System.out.println("Cards :");
        for (int i = 0; i < pickedCards.length; i++) {
            System.out.println(pickedCards[i]);
        }
        System.out.println("Number of picks that yields the sum of 24 : " + count);
    }

    public static int getCardsValue(String pickedCard) {
        int index = pickedCard.indexOf(" of ");
        String rank = pickedCard.substring(0 , index);
        switch (rank){
            case "Ace" : return 1 ;
            case "King" : return 13 ;
            case "Queen" : return 12 ;
            case "Jack" : return 11 ;
        }
        return Integer.parseInt(rank);
    }

    public static void shuffleTheCards(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }
    public static void initializeTheCards(String[] deck, String[] suits, String[] ranks) {
        int i = 0;
        for (int j = 0; j < suits.length; j++) {
            for (int k = 0; k < ranks.length; k++) {
                deck[i] = ranks[k] + " of " + suits[j];
                i++;
            }
        }
    }
}
