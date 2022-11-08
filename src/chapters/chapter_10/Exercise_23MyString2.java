package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_23MyString2 {
    private char[] chars;

    public Exercise_23MyString2(char[] chars) {
        this.chars = chars;
    }

    public Exercise_23MyString2(String s) {
        chars = s.toCharArray();
    }

    public int compare(String s) {
        char[] stringChars = new char[s.length()];
        int index = 0;
        for (int i = 0; i < chars.length && i < s.length(); i++) {
            if (chars[i] != s.charAt(i)) {
                return s.charAt(i) - chars[i];
            }
        }
        if (chars.length == s.length()) {
            return 0;
        } else if (chars.length < s.length()) {
            return -1;
        } else {
            return 1;
        }

    }

    public Exercise_23MyString2 substring(int begin) {
        if ((begin < 0) || (begin >= chars.length - 1)) {
            System.out.println("Invalid input");
            System.exit(-2);
        }
        char[] result = new char[chars.length - begin];
        for (int i = begin, j = 0; i < chars.length; i++, j++) {
            result[j] = chars[i];
        }
        return new Exercise_23MyString2(result);
    }

    public Exercise_23MyString2 toUpperCase() {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i]) >= 97 && ((int) chars[i]) <= 122) {
                result[i] = (char) (65 + (((int) chars[i]) - 97));
            } else {
                result[i] = chars[i];
            }
        }
        return new Exercise_23MyString2(result);
    }

    public char[] toChars() {
        return chars;
    }

    public static Exercise_23MyString2 valueOf(boolean b) {
        if (b) {
            return new Exercise_23MyString2("true");
        } else {
            return new Exercise_23MyString2("false");
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
