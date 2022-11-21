package chapters.chapter_12;

public class Exercise_08HexFormatException extends Exception{

    public Exercise_08HexFormatException () {
        super("Invalid Hex Digit ! ");
    }

    public Exercise_08HexFormatException (String message) {
        super(message);
    }
}
