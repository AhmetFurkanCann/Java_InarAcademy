package chapters.chapter_10;

public class Exercise_08Tax {
    private int filingStatus ;
    final static String[] taxConstants = {"SINGLE_FILER" , "MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER" , "MARRIED_SEPARATELY" , "HEAD_OF_HOUSEHOLD" };
    private int[][] brackets;
    private double[] rates ;
    private double taxableIncome ;

    public Exercise_08Tax(){
        this(0 , null , null , 0) ;
    }
    public Exercise_08Tax(int filingStatus , int[][] brackets , double[] rates , double taxableIncome){
        this.filingStatus = filingStatus ;
        this.brackets = brackets ;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        int index = -1 ;
        for (int i = 0; i < brackets[0].length; i++) {
            if (taxableIncome > brackets[filingStatus][i]){
                index = i;
            }
        }
        if (index == -1) {
            return taxableIncome * rates[0] ;
        }
        double tax = brackets[filingStatus][0] * rates[0] ;
        int lastIndex = 0 ;
        for (int i = 0; i < index ; i++) {
            tax += (brackets[filingStatus][i + 1] - brackets[filingStatus][i]) * rates[i + 1] ;
            lastIndex = i;
        }
        tax += (taxableIncome - brackets[filingStatus][index]) * rates[lastIndex + 1] ;
        return tax ;
    }
}
