package chapters.chapter_10;

public class Exercise_08TestTax {
    public static void main(String[] args) {
        double[] rates2009 = {0.10 , 0.15 , 0.25 , 0.28 , 0.33 , 0.35} ;
        int[][] brackets2009 = {{8350,33950,82250,171550,372950} , {16700,67900,137050,208850,372950} , {8350,33950,68525,104425,186475} , {11950,45500,117450,190200,372950}} ;
        double[] rates2001 = {0.15 , (27.5 / 100) , (30.5 / 100) , (35.5 / 100) , (39.1 / 100) } ;
        int[][] brackets2001 = {{27051 ,65550,136750,297350 } , {45200,109250,166500,297350},{22600,54625,83250,148675},{36250,93650,121650,297350}};
        Exercise_08Tax table2009 = new Exercise_08Tax(0,brackets2009,rates2009,50000);
        Exercise_08Tax table2001 = new Exercise_08Tax(0,brackets2001,rates2001,50000);
        System.out.println("---------------------------------------------------------------------2009------------------------------------------------------------");
        printHead();
        for (int i = 50000; i < 60001; i+=1000) {
            table2009.setTaxableIncome(i);
            System.out.printf("%-40d" , i);
            for (int j = 0; j < Exercise_08Tax.taxConstants.length; j++) {
                table2009.setFilingStatus(j);
                System.out.printf("%-40s", table2009.getTax());
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------2001------------------------------------------------------------");
        printHead();
        for (int i = 50000; i < 60001; i+=1000) {
            table2001.setTaxableIncome(i);
            System.out.printf("%-40d" , i);
            for (int j = 0; j < Exercise_08Tax.taxConstants.length; j++) {
                table2001.setFilingStatus(j);
                System.out.printf("%-40s", table2001.getTax());
            }
            System.out.println();
        }
    }

    private static void printHead() {
        System.out.println("Income                                  " + Exercise_08Tax.taxConstants[0] + "                            " + Exercise_08Tax.taxConstants[1] + "   " + Exercise_08Tax.taxConstants[2] + "                      " + Exercise_08Tax.taxConstants[3] + "\t" );
    }

}
