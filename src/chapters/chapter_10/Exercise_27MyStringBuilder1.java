package chapters.chapter_10;

public class Exercise_27MyStringBuilder1 {
    private char[] chars;

    public Exercise_27MyStringBuilder1(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }

    public Exercise_27MyStringBuilder1 append(Exercise_27MyStringBuilder1 s) {
        char[] result = new char[chars.length + s.length()];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i];
        }
        for (int i = chars.length, j = 0; j < s.length(); j++, i++) {
            result[i] = s.charAt(j);
        }
        chars = result ;
        return this ;
    }

    public Exercise_27MyStringBuilder1 append(int i) {
        return new Exercise_27MyStringBuilder1(toString() + i);
    }

    public char charAt(int index) {
        return chars[index];
    }
    public Exercise_27MyStringBuilder1 toLowerCase() {
        char[] result = new char[chars.length] ;
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i]) >= 65 && ((int) chars[i]) <= 90){
                result[i] = (char) (97 + (((int) chars[i]) - 65)) ;
            }
            else {
                result[i] = chars[i];
            }
        }
        chars = result ;
        return this ;
    }
    public Exercise_27MyStringBuilder1 substring (int begin , int end) {
        if ((begin < 0) || (end > chars.length) || (end < begin) || (begin >= chars.length - 1) || (end <= 0) ){
            System.out.println("Invalid input");
            System.exit(-2);
        }
        char[] result = new char[end - begin];
        for (int i = begin , j = 0; i < end; i++ , j++) {
            result[j] = chars[i] ;
        }
        chars = result ;
        return this ;
    }

    public int length() {
        return chars.length;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
