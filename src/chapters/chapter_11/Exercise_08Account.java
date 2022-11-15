package chapters.chapter_11;

import chapters.chapter_01.Exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_08Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name ;
    private ArrayList<Exercise_08Transaction> transactions = new ArrayList<>() ;

    public Exercise_08Account() {
        this("",0, 0, 0, new Date());
    }

    public Exercise_08Account(String name,int id, double balance, double annualInterestRate, Date dateCreated) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public ArrayList<Exercise_08Transaction> getTransactions() {
        return transactions;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList<Exercise_08Transaction> transactions) {
        this.transactions = transactions;
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
            transactions.add(new Exercise_08Transaction(new Date(),'W',amount,balance,"withdraw")) ;
        }
        else {
            System.out.println("You can not withdraw money because your balance is : " + balance);
        }
    }
    public void deposit (double amount) {
        balance += amount ;
        transactions.add(new Exercise_08Transaction(new Date(),'D',amount,balance,"deposit")) ;
    }
    @Override
    public String toString() {
        return "Name : " + name + " Id : " + getId() + " Balance : " + getBalance() + " AnnualInterestRate : " + getAnnualInterestRate() + " Date Created : " + getDateCreated() ;
    }
}
