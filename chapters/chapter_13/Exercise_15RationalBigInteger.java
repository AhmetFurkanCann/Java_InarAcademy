package chapters.chapter_13;

import java.math.BigInteger;

public class Exercise_15RationalBigInteger extends Number implements Comparable<Exercise_15RationalBigInteger> {
    private BigInteger numerator ;
    private BigInteger denominator ;


    public Exercise_15RationalBigInteger() {
        this(new BigInteger("0"), new BigInteger("1"));
    }


    public Exercise_15RationalBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        BigInteger zero = new BigInteger("0");
        BigInteger isNegative = new BigInteger(denominator.compareTo(zero) > 0 ? "1" : "-1");
        this.numerator = isNegative.multiply(numerator.divide(gcd));
        this.denominator = denominator.divide(gcd) ;
    }


    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger gcd = new BigInteger("1");
        BigInteger n1 = n.compareTo(BigInteger.ZERO) > 0 ? n : n.multiply(new BigInteger("-1"));
        BigInteger n2 = d.compareTo(BigInteger.ZERO) > 0 ? d : d.multiply(new BigInteger("-1"));

        for (BigInteger k = new BigInteger("1");  k.compareTo(n1) != 1 && k.compareTo(n2) != 1 ; k.add(new BigInteger("0"))) {
            if (((n1.remainder(k)).compareTo(new BigInteger("0")) == 0 && ((n2.remainder(k)).compareTo(new BigInteger("0")) == 0 ))){
                gcd = k;
            }
        }
        return gcd ;
    }


    public BigInteger getNumerator() {
        return numerator;
    }


    public BigInteger getDenominator() {
        return denominator;
    }


    public Exercise_15RationalBigInteger add(Exercise_15RationalBigInteger secondRational) {
        BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(denominator.multiply(secondRational.getNumerator())) ;
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Exercise_15RationalBigInteger(n,d) ;
    }


    public Exercise_15RationalBigInteger subtract(Exercise_15RationalBigInteger secondRational) {
        BigInteger n = (numerator.multiply(secondRational.getDenominator())).subtract(denominator.multiply(secondRational.getNumerator())) ;
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Exercise_15RationalBigInteger(n,d) ;
    }


    public Exercise_15RationalBigInteger multiply(Exercise_15RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator()) ;
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Exercise_15RationalBigInteger(n, d);
    }


    public Exercise_15RationalBigInteger divide(Exercise_15RationalBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()) ;
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Exercise_15RationalBigInteger(n, d);
    }

    @Override
    public String toString() {
        if (denominator.compareTo(new BigInteger("1")) == 0)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((Exercise_15RationalBigInteger) (other))).getNumerator().compareTo(BigInteger.ZERO) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue() ;
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Exercise_15RationalBigInteger o) {
        if ((this.subtract(o).getNumerator()).compareTo(new BigInteger("0")) > 0)
            return 1;
        else if ((this.subtract(o).getNumerator()).compareTo(new BigInteger("0")) < 0)
            return -1;
        else
            return 0;
    }
}
