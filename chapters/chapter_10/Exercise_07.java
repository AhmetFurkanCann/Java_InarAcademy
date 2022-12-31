package chapters.chapter_10;

import chapters.chapter_09.Exercise_07Account;

import java.util.Date;
import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise_07Account[] accounts = new Exercise_07Account[10];
        initializeAccounts(accounts);
        int id = getId();
        do {
            printMainMenu();
            System.out.println("Enter a choice : ");
            int choice = input.nextInt();
            if (choice == 1){
                checkBalance(id , accounts);
            }else if (choice == 2){
                withdraw(id , accounts , input);
            }else if (choice == 3){
                deposit(id , accounts , input);
            }
            else if (choice == 4){
                id = getId();
            }
            else {
                System.out.println("Please enter a number between 0-5");
            }
        }while (true);
    }

    private static void deposit(int id , Exercise_07Account[] accounts , Scanner input) {
        System.out.println("Enter an amount to deposit : ");
        double amount = input.nextDouble();
        accounts[id].deposit(amount);
    }

    private static void withdraw(int id ,Exercise_07Account[] accounts , Scanner input) {
        System.out.println("Enter an amount to withdraw : ");
        double amount = input.nextDouble();
        accounts[id].withdraw(amount);
    }

    private static void checkBalance(int id , Exercise_07Account[] accounts) {
        System.out.println("The balance is " + accounts[id].getBalance());
    }

    private static void printMainMenu() {
        System.out.println("Main Menu \n" + "1 : Check balance \n" + "2 : Withdraw \n" + "3 : Deposit \n" + "4 : exit");
    }

    private static int getId() {
        Scanner input = new Scanner(System.in);
        int id ;
        do {
            System.out.println("Enter an id :");
            id = input.nextInt();
            if (id < 0 || id > 9) {
                System.out.println("Enter a correct id ");
            }
        }while (id < 0 || id > 9);
        return id ;
    }

    private static void initializeAccounts(Exercise_07Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Exercise_07Account(i , 100 , 0 , new Date()) ;
        }
    }
}
