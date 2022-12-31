package chapters.chapter_12;

public class Exercise_04LoanClassWithTryCatch  {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;


    public Exercise_04LoanClassWithTryCatch() throws IllegalArgumentException{
        this(2.5, 1, 1000);
    }

    public Exercise_04LoanClassWithTryCatch (double annualInterestRate, int numberOfYears,
                                            double loanAmount) throws IllegalArgumentException {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new java.util.Date();
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate > 0) {
            this.annualInterestRate = annualInterestRate;
        }
        else {
            throw new IllegalArgumentException("Annual Interest Rate can not be zero or negative") ;
        }
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }


    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears > 0) {
            this.numberOfYears = numberOfYears;
        }
        else {
            throw new IllegalArgumentException("Number of Years can not be zero or negative") ;
        }
    }


    public double getLoanAmount() {
        return loanAmount;
    }


    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount > 0) {
            this.loanAmount = loanAmount;
        }
        else {
            throw new IllegalArgumentException("Loan Amount  can not be zero or negative") ;
        }
    }


    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }


    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }


    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
