package chapters.chapter_09;

public class Exercise_02Stock {
    String symbol ;
    String name ;
    double previousClosingPrice ;
    double currentPrice ;
    Exercise_02Stock(String symbol , String name){
        this.symbol = symbol ;
        this.name = name ;
    }
    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) * 100) / previousClosingPrice ;
    }
}
