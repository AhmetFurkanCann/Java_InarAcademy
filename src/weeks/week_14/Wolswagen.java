package weeks.week_14;

public class Wolswagen {
    protected String brand ;
    protected int wheels ;
    protected int airBag ;
    protected String color ;
    protected int year ;

    public Wolswagen() {
        this("Wolswagen", 4,2,"white" , 2022);
    }

    public Wolswagen(String brand, int wheels, int airBag, String color, int year) {
        this.brand = brand;
        this.wheels = wheels;
        this.airBag = airBag;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public int getAirBag() {
        return airBag;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setAirBag(int airBag) {
        this.airBag = airBag;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString () {
        return "Brand : " + brand +"\nWheels : " +  wheels + "\n Air Bag : " + airBag + "\n Color : " + color + " \n Year : " + year ;
     }
}
