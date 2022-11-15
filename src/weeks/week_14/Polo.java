package weeks.week_14;

public final class Polo extends Wolswagen {
    private String model ;
    private int engine ;

    public Polo(String brand, int wheels, int airBag, String color, int year, int engine) {
        super(brand, wheels, airBag, color, year);
        this.engine = engine;
        this.model = "Polo" ;
    }

    public Polo() {
        this(2000) ;
        this.model = "Polo" ;
    }

    public Polo(int engine) {
        this.model = "Polo" ;
        this.engine = engine;
    }

    final double getTax(double price) {
        return price * engine * year ;
    }
    @Override
    public String toString () {
        return super.toString() + " Model : " + model + "\n Engine : " + engine ;
    }
}
