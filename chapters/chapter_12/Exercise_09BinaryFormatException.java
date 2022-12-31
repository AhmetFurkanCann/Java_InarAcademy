package chapters.chapter_12;

public class Exercise_09BinaryFormatException extends Exception{
    public Exercise_09BinaryFormatException () {
        super("Invalid Binary Number ! ");
    }

    public Exercise_09BinaryFormatException (String message) {
        super(message);
    }
}
