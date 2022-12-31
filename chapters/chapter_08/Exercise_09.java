package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        char[][] table = new char[3][3];
        fillTheTable(table) ;
        drawTable(table);
        int xORo = 1;
        do {
            int row = rowInput(xORo);
            int column = columnInput(xORo);
            table[row][column] = (xORo % 2 == 1) ? 'X' : 'O' ;
            drawTable(table) ;
            xORo++;
        } while (controlTable(table) && (xORo < 10)) ;
        displayResult(table , xORo ) ;
    }

    public static void fillTheTable(char[][] table) {
        char ch = '1' ;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = ch ;
                ch++;
            }
        }
    }

    public static void displayResult(char[][] table , int xOro) {
        if (controlTable(table)){
            System.out.println("DRAW");
        }
        else {
            System.out.println(((xOro % 2 == 0) ? " X " : " O " ) + "Player Won");
        }
    }

    public static boolean controlTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            if(table[i][0] == table[i][1] && table[i][1] == table[i][2]){
                return false ;
            }
            if(table[0][i] == table[1][i] && table[1][i] == table[2][i]){
                return false ;
            }
        }
        if (table[0][0] == table[1][1] && table[1][1] == table[2][2]) {
            return false ;
        }
        if (table[2][0] == table[1][1] && table[1][1] == table[0][2]) {
            return false ;
        }
        return true ;
    }

    public static int columnInput(int xORo) {
        Scanner input = new Scanner(System.in) ;
        if (xORo % 2 == 1){
            System.out.println("Enter a column (0 , 1 , 2 ) for player X : ");
        }
        else {
            System.out.println("Enter a column (0 , 1 , 2 ) for player O : ");
        }
        return input.nextInt() ;
    }

    public static int rowInput(int xORo) {
        Scanner input = new Scanner(System.in) ;
        if (xORo % 2 == 1){
            System.out.println("Enter a row (0 , 1 , 2 ) for player X : ");
        }
        else {
            System.out.println("Enter a row (0 , 1 , 2 ) for player O : ");
        }
        return input.nextInt() ;
    }

    public static void drawTable(char[][] table) {
        System.out.println("----------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print((Character.isDigit(table[i][j]) ? " " : table[i][j]) + " |");
            }
            System.out.println();
            System.out.println("----------");
        }
    }
}
