package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] eqn = new double[3];
        System.out.println("Enter values for a , b, c ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i]= input.nextDouble();
        }
        double[] roots = new double[2];
        int numberOfRealRoots = solveQuadratic(eqn,roots);
        if (numberOfRealRoots == 0){
            System.out.println("The equation has no real roots");
        } else if (numberOfRealRoots == 1) {
            System.out.println("The equation has one root " + roots[0]);
        }
        else {
            System.out.println("The equation has two roots " + roots[0] + " and " + roots[1]);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];
        if(discriminant < 0){
            return 0 ;
        }
        else if (discriminant == 0){
            roots[0]= (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            return 1;
        }
        else {
            roots[0]= (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
            roots[1]= (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            return 2 ;
        }

    }
}
