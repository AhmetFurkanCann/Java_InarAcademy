package chapters.chapter_11;

import chapters.chapter_09.Exercise_07Account;

import java.util.Date;

public class Exercise_03SavingAccount extends Exercise_07Account {

    public Exercise_03SavingAccount() {
    }

    public Exercise_03SavingAccount(int id, double balance, double annualInterestRate, Date dateCreated) {
        super(id, balance, annualInterestRate, dateCreated);
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("Saving accounts can not withdraw amount");
    }
    @Override
    public String toString() {
        return "SavingAccount can not be overdrawn " ;
    }
}
