package chapters.chapter_09;

public class Exercise_08TestFan {
    public static void main(String[] args) {
        Exercise_08Fan fan1 = new Exercise_08Fan();
        fan1.setSpeed(Exercise_08Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Exercise_08Fan fan2 = new Exercise_08Fan();
        fan2.setSpeed(Exercise_08Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println("Object fan1 : " + fan1.toString());
        System.out.println("Object fan2 : " + fan2.toString());
    }
}
