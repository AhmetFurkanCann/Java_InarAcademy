package chapters.chapter_09;

public class Exercise_02TestStock {
    public static void main(String[] args) {
        Exercise_02Stock stock1 = new Exercise_02Stock("ORCL" , "Oracle Corporation" ) ;
        stock1.previousClosingPrice = 34.5 ;
        stock1.currentPrice = 34.35 ;
        System.out.println("Price - change Percentage of stock 1 is " + stock1.getChangePercent());
    }
}
