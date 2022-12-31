package chapters.chapter_09;

import java.util.Date;

public class Exercise_07TestAccount {
    public static void main(String[] args) {
        Exercise_07Account a = new Exercise_07Account(1122 , 20000 , 4.5 , new Date() ) ;
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("Balance of the account : " + a.getBalance() +
                " Monthly interest of the account : " + a.getMonthlyInterest() +
                " Date when account was created " + a.getDateCreated());
    }
}
