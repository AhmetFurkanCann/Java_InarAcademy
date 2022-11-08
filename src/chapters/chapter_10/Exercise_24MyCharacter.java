package chapters.chapter_10;

public class Exercise_24MyCharacter {
    private char ch;

    public Exercise_24MyCharacter() {
        this(' ');
    }

    public Exercise_24MyCharacter(char ch) {
        this.ch = ch;
    }

    public Exercise_24MyCharacter(String s, int index) {
        this.ch = s.charAt(index);
    }

    public char getCh() {
        return ch;
    }

    public static boolean isDigit(char ch) {
        if ((int) ch >= 48 && (int) ch <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLetter(char ch) {
        if (((int) ch >= 65 && (int) ch <= 90) || ((int) ch >= 97 && (int) ch <= 122)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLetterOrDigit(char ch) {
        if (isDigit(ch) || isLetter(ch)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLowerCase(char ch) {
        if ((int) ch >= 97 && (int) ch <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUpperCase(char ch) {
        if ((int) ch >= 65 && (int) ch <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public static char toLowerCase(char ch) {
        return (char) (97 + ((int) ch - 65));
    }

    public static char toUpperCase(char ch) {
        return (char) (65 + ((int) ch - 97));
    }
    public static Exercise_24MyCharacter valueOf(char ch) {
        return new Exercise_24MyCharacter(ch);
    }
    public int compareTo(Exercise_24MyCharacter ch) {
        return getCh() - ch.getCh();
    }
    public static int compare(char x, char y) {
        return x - y;
    }
    public boolean equals(Exercise_24MyCharacter ch) {
        return compareTo(ch) == 0;
    }
    public String toString() {
        return ch + "";
    }
}
