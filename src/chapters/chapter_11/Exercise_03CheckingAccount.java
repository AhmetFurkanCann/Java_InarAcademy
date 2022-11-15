package chapters.chapter_11;

import java.util.Date;

public class Exercise_03CheckingAccount extends Exercise_03SavingAccount{
    private double overdraftLimit ;
    public Exercise_03CheckingAccount() {
        this(0) ;
    }

    public Exercise_03CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public Exercise_03CheckingAccount(int id, double balance, double annualInterestRate, Date dateCreated, double overdraftLimit) {
        super(id, balance, annualInterestRate, dateCreated);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw (double amount) {
        if (amount < overdraftLimit) {
            super.withdraw(amount);
        }
        else {
            System.out.println("You can not withdraw amount higher than " + overdraftLimit);
        }
    }
    @Override
    public String toString() {
        return "Checking Account : You can not withdraw amount higher than " + overdraftLimit ;
    }
}
