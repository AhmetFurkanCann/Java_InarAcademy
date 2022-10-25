package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        int[][] table = new int[6][7];
        fillTheTable(table);
        int[] emptySpace = new int[7];
        fillTheEmptySpace(emptySpace);
        playGame(table , emptySpace);
    }

    public static void fillTheTable(int[][] table) {
        int num = 2 ;
        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = num ;
                num++;
            }
        }
    }

    public static void fillTheEmptySpace(int[] emptySpace) {
        for (int i = 0; i < emptySpace.length; i++) {
            emptySpace[i] = 5 ;
        }
    }

    public static void playGame(int[][] table , int[] emptySpace) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        do {
            count++;
            printTable(table);
            System.out.println("Drop a " + ((count % 2 == 1) ? "red" : "yellow") +  " disk at column (0–6):");
            int slot = input.nextInt();
            if(emptySpace[slot] < 0){
                continue;
            }
            table[emptySpace[slot]][slot] = (count % 2 == 1) ? 0 : 1 ;
            emptySpace[slot]--;
        } while (control(table) && count < 42) ;
        printTable(table);
        if (control(table)){
            System.out.println("DRAW");
        }
        else {
            System.out.println(((count % 2 == 1) ? "Red " : "Yellow ") + "player won");
        }
    }

    public static boolean control(int[][] table) {
        return rowControl(table) && columnControl(table) && majorDiagonalControl(table) && subDiagonalControl(table) ;
    }

    public static boolean subDiagonalControl(int[][] table) {
        for (int i = table.length - 1; i > 2; i--) {
            for (int j = 0; j < table[0].length - 3; j++) {
                if(table[i][j] == table[i - 1][j + 1] && table[i - 1][j + 1] == table[i - 2][j + 2] && table[i - 2][j + 2] == table[i - 3][j + 3]){
                    return false;
                }
            }
        }
        return true ;
    }

    public static boolean majorDiagonalControl(int[][] table) {
        for (int i = 0; i < table.length - 3; i++) {
            for (int j = 0; j < table[0].length - 3; j++) {
                if(table[i][j] == table[i + 1][j + 1] && table[i + 1][j + 1] == table[i + 2][j + 2] && table[i + 2][j + 2] == table[i + 3][j + 3]){
                    return false;
                }
            }
        }
        return true ;
    }

    public static boolean columnControl(int[][] table) {
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table.length - 3; j++) {
                if(table[j][i] == table[j + 1][i] && table[j + 1][i] == table[j + 2][i] && table[j + 2][i] == table[j + 3][i]){
                    return false;
                }
            }
        }
        return true ;
    }

    public static boolean rowControl(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length - 3; j++) {
                if(table[i][j] == table[i][j + 1] && table[i][j + 1] == table[i][j + 2] && table[i][j + 2] == table[i][j + 3]){
                    return false;
                }
            }
        }
        return true ;
    }

    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print((table[i][j] > 1 ) ? "  |" : ((table[i][j] == 0 ) ? "R |" : "Y |" ));
            }
            System.out.println();
        }
        System.out.println("———————————————");
    }
}
