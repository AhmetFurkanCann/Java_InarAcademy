package chapters.chapter_09;

import java.util.Date;

public class Exercise_07Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Exercise_07Account() {
        this(0, 0, 0, new Date());
    }

    public Exercise_07Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getMonthlyInterestRate() {
        return ((annualInterestRate / 100) / 12) ;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() ;
    }
    public void withdraw (double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("You can not withdraw money because your balance is : " + balance);
        }
    }
    public void deposit (double amount) {
        balance += amount ;
    }
    @Override
    public String toString() {
        return "Id : " + getId() + " Balance : " + getBalance() + " AnnualInterestRate : " + getAnnualInterestRate() + " Date Created : " + getDateCreated() ;
    }
}
