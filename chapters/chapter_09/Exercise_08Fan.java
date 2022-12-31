package chapters.chapter_09;

public class Exercise_08Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Exercise_08Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        if (isOn()) {
            return getSpeed() + " " + getColor() + " " + getRadius();
        } else {
            return getColor() + " " + getRadius() + " fan is off";
        }
    }
}
