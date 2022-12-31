package weeks.week_15;

public class Calculator {
    private static Number result;

    public Calculator() {
        this(new Number(0));
    }

    public Calculator(Number result) {

        this.result = result;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    public static Number sum(Number n1, Number n2) {
        result = new Number(n1.getValue() + n2.getValue());
        return result;

    }

    public static Number subtract(Number n1, Number n2) {
        result = new Number(n1.getValue() - n2.getValue());
        return result;
    }

    public static Number multiply(Number n1, Number n2) {
        result = new Number(n1.getValue() * n2.getValue());
        return result;
    }

    public static Number divide(Number n1, Number n2) {
        result = new Number(n1.getValue() / n2.getValue());
        return result;
    }

    public static Number mod(Number n1, Number n2) {
        result = new Number(n1.getValue() % n2.getValue());
        return result;
    }

    public static Number changeSign(Number n1) {
        result = new Number(n1.getValue() * -1);
        return result;
    }

    public static Number reset() {
        result = new Number(); // default 0 dı zaten
        return result;
    }

}
