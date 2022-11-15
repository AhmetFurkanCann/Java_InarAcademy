package chapters.chapter_11;

import chapters.chapter_09.Exercise_07Account;

public class Exercise_03Test {
    public static void main(String[] args) {
        Exercise_07Account account = new Exercise_07Account() ;
        Exercise_03SavingAccount savingAccount = new Exercise_03SavingAccount() ;
        Exercise_03CheckingAccount checkingAccount = new Exercise_03CheckingAccount(100) ;
        checkingAccount.withdraw(150);
        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());
    }
}
