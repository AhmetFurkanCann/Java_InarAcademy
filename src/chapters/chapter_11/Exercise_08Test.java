package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_08Test {
    public static void main(String[] args) {
        Exercise_08Account account = new Exercise_08Account("George" ,1122, 1000 , 1.5 , new Date()) ;
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account.toString());
        ArrayList<Exercise_08Transaction> transactions = account.getTransactions() ;
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());
        }
    }
}
