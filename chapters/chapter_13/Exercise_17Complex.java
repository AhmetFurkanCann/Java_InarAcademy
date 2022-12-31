package chapters.chapter_13;

public class Exercise_17Complex implements Cloneable , Comparable<Exercise_17Complex> {
    private double a ;
    private double b ;
    public Exercise_17Complex(){
        this(0,0);
    }

    public Exercise_17Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Exercise_17Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getRealPart() {
        return a ;
    }
    public double getImaginaryPart() {
        return b ;
    }
    public Exercise_17Complex add (Exercise_17Complex number) {
        return new Exercise_17Complex((a + number.getRealPart()) , (b + number.getImaginaryPart()));
    }
    public Exercise_17Complex subtract (Exercise_17Complex number) {
        return new Exercise_17Complex((a - number.getRealPart()) , (b - number.getImaginaryPart()));
    }
    public Exercise_17Complex multiply (Exercise_17Complex number) {
        return new Exercise_17Complex(a * number.getRealPart() - b * number.getImaginaryPart() ,
                b * number.getRealPart() + a * number.getImaginaryPart());
    }
    public Exercise_17Complex divide (Exercise_17Complex number) {
        return new Exercise_17Complex((a * number.getRealPart() + b * number.getImaginaryPart()) /
                (Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginaryPart(), 2)),
                (b * number.getRealPart() - a * number.getImaginaryPart()) /
                        (Math.pow(number.getRealPart(), 2) +  Math.pow(number.getImaginaryPart(), 2)));
    }
    public double abs() {
        return Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2)) ;
    }
    @Override
    public String toString() {
        return (b == 0) ? (a + "") : ("(" + a + " + " + b + "i)") ;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Exercise_17Complex) super.clone() ;
    }
    @Override
    public int compareTo(Exercise_17Complex number) {
        if (this.abs() > number.abs()){
            return 1 ;
        } else if (this.abs() < number.abs()) {
            return -1 ;
        }
        else {
            return 0 ;
        }
    }
}
