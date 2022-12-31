package weeks.week_14;

public class Animal {
    private double weight ;
    private double height ;
    private boolean hasSwimmingSkills ;
    private boolean hasFlyingSkills ;

    public Animal(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public Animal() {
        this(0,0,false,false);
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
    public void runs(){
        System.out.println("It's running");
    }
    public void eats(){
        System.out.println("It's eating.");
    }
    public void sleeps(){
        System.out.println("It's sleeping.");
    }
}
