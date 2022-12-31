package chapters.chapter_12;

public class Exercise_05IllegalTriangleException extends Exception{

    public Exercise_05IllegalTriangleException() {
        super("Invalid Sides !");
    }

    public Exercise_05IllegalTriangleException(String message) {
        super(message);
    }
}
