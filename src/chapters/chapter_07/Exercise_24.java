package chapters.chapter_07;

public class Exercise_24 {
    public static void main(String[] args) {
        String[] deck = new String[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        initializeTheCards(deck, suits, ranks);
        shuffleTheCards(deck);
        int numberOfPicks = pickCards(deck);
        System.out.println("Number of picks : " + numberOfPicks);

    }

    public static void shuffleTheCards(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static int pickCards(String[] deck) {
        int count = 0 ;
        int suitableCards = 0 ;
        String[] pickedCards = new String[4];
        while(suitableCards < pickedCards.length){
            int card = (int) (Math.random() * 52) ;
            if(isPossible(pickedCards , deck , card , suitableCards)){
                pickedCards[suitableCards] = deck[card];
                suitableCards++;
            }
                count++;
        }
        displayCards(pickedCards);
        return count ;
    }

    public static void displayCards(String[] pickedCards) {
        for (int i = 0; i < pickedCards.length; i++) {
            System.out.println(pickedCards[i]);
        }
    }

    public static boolean isPossible(String[] pickedCards, String[] deck, int card , int suitableCards) {
        int index = deck[card].indexOf(" of ");
        String suit = deck[card].substring(index + 4);
        for (int i = 0; i < suitableCards; i++) {
            int indexOfPickedCards = pickedCards[i].indexOf(" of ") ;
            String suitOfPickedCards = pickedCards[i].substring(indexOfPickedCards + 4);
            if(suit.equals(suitOfPickedCards)){
                return false;
            }
        }
        return true ;
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

