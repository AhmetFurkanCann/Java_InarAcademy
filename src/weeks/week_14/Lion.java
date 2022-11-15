package weeks.week_14;

public class Lion {
    private int tailSize;
    private double weight ;
    private double height ;
    private boolean hasSwimmingSkills ;
    private boolean hasFlyingSkills ;

    public Lion(double weight, double height, boolean hasSwimmingSkills, boolean hasFlyingSkills, int tailSize) {
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
        this.tailSize = tailSize ;
    }

    public Lion() {
        this(0,0,false,false , 0);
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
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
    public void roar(){
        System.out.println("ROOOOAAAARRRRR");
    }

}
