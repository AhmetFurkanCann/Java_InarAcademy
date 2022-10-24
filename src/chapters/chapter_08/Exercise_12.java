package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        System.out.println("( 0 -Single filer , 1 - Married jointly or qualifying widow(er) , 2 - Married separately , 3 - Head of houshold ) Enter filling status : ");
        int status = input.nextInt();
        System.out.println("Enter taxable income : ");
        double income = input.nextDouble();
        double tax = 0;
        int taxIndex = getTaxIndex(income , status , brackets);
        System.out.println("Tax is " + (int) (taxAmount(income , status , brackets , taxIndex ,rates) * 100 ) / 100.0);
    }

    public static double taxAmount(double income, int status, int[][] brackets, int taxIndex, double[] rates) {
    if(taxIndex == -1) {
        return income * rates[0];
    }
    double tax = brackets[status][0] * rates[0] ;
    int a = -1 ;
        for (int i = 0; i < taxIndex; i++) {
            tax += (brackets[status][i + 1] - brackets[status][i]) * rates[i + 1] ;
            a = i ;
        }
        tax += (income - brackets[status][taxIndex]) * rates[a + 1] ;
        return tax ;
    }

    public static int getTaxIndex(double income, int status, int[][] brackets) {
        int index = -1 ;
        for (int i = 0; i < brackets[0].length; i++) {
            if (income > brackets[status][i]){
                index = i;
            }
        }
        return index ;
    }
}
