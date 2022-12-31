package chapters.chapter_11;

import java.util.Date;

public class Exercise_08Transaction {
    private java.util.Date date;
    char wOrd ;
    double amount ;
    double balance ;
    String description ;

    public Exercise_08Transaction(Date date, char wOrd, double amount, double balance, String description) {
        this.date = date;
        this.wOrd = wOrd;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Date : " + date.toString() + " W or D : " + wOrd + " Amount : " + amount + " Balance : " + balance + " Description : " + description ;
    }
}
