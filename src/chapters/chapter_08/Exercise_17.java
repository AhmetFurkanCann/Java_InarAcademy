package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks : ");
        int numberOfBanks = input.nextInt();
        System.out.println("Enter minimum total assets for keeping a bank safe : ");
        int limit = input.nextInt();
        double[] assetsOfBanks = new double[numberOfBanks];
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];
        int[] unsafeControlArray = new int[numberOfBanks];
        fillTheUnsafeControlArray(unsafeControlArray);
        getBorrowersArray(borrowers , assetsOfBanks);
        findAndDisplayAllTheUnsafeBanks(unsafeControlArray , assetsOfBanks , borrowers , limit);
    }

    public static void findAndDisplayAllTheUnsafeBanks(int[] unsafeControlArray, double[] assetsOfBanks, double[][] borrowers, int limit) {
        boolean isContinue ;
        do {
            isContinue = false;
            for (int i = 0; i < assetsOfBanks.length; i++) {
                if(!isSafe(i , assetsOfBanks , borrowers ,limit ) && unsafeControl(i , unsafeControlArray)) {
                    unsafeControlArray[i] = i ;
                    fixBorrowers(i , borrowers);
                    isContinue = true ;
                }
            }
        } while (isContinue) ;

        System.out.println("Unsafe banks are : ");
        for (int i = 0; i < assetsOfBanks.length; i++) {
            if(!isSafe(i , assetsOfBanks, borrowers , limit)){
                System.out.print(i + " ");
            }
        }

    }

    public static void fixBorrowers(int number , double[][] borrowers) {
        for (int i = 0; i < borrowers.length; i++) {
            borrowers[i][number] = 0;
        }
    }

    public static boolean unsafeControl(int number , int[] unsafeControlArray) {
        return unsafeControlArray[number] == -1 ? true : false ;
    }

    public static boolean isSafe(int number, double[] assetsOfBanks, double[][] borrowers , double limit) {
        double asset = assetsOfBanks[number];
        for (int i = 0; i < assetsOfBanks.length; i++) {
            asset += borrowers[number][i];
        }
        return (asset < limit) ? false : true ;
    }


    public static void getBorrowersArray(double[][] borrowers , double[] assetsOfBanks ) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < borrowers.length; i++) {
            System.out.println("Enter bank " + i + " 's total assets " + " Enter the number of banks that borrowed money from bank " +
             i + " Enter borrowers ID " + " amount borrowed");
            assetsOfBanks[i] = input.nextDouble();
            int numberOfBanksBorrowedMoneyFromBank = input.nextInt();
            for (int j = 0; j < numberOfBanksBorrowedMoneyFromBank; j++) {
                int bank = input.nextInt();
                borrowers[i][bank] = input.nextDouble();
            }
        }
    }

    public static void fillTheUnsafeControlArray(int[] unsafeControlArray) {
        for (int i = 0; i < unsafeControlArray.length; i++) {
            unsafeControlArray[i] = -1 ;
        }
    }
}
