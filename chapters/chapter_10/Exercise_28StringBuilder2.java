package chapters.chapter_10;

public class Exercise_28StringBuilder2 {
    private char[] chars;
    public Exercise_28StringBuilder2() {
        this(new char[1]);
    }
    public Exercise_28StringBuilder2(String s) {
        chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }
    public Exercise_28StringBuilder2(char[] chars) {
       this.chars = chars ;
    }
    public Exercise_28StringBuilder2 insert(int offset, Exercise_28StringBuilder2 s){
        char[] result = new char[chars.length + s.length()] ;
        for (int i = 0; i < offset; i++) {
            result[i] = chars[i];
        }
        for (int i = offset , j = 0; j < s.length(); i++ , j++) {
            result[i] = s.charAt(j);
        }
        for (int i = offset + s.length() , j = offset ; i < result.length; i++ , j++) {
            result[i] = chars[j] ;
        }
        chars = result ;
        return this ;
    }
    public Exercise_28StringBuilder2 reverse(){
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp ;
        }
        return this ;
    }
    public Exercise_28StringBuilder2 substring(int begin) {
        if ((begin < 0) || (begin >= chars.length - 1)) {
            System.out.println("Invalid input");
            System.exit(-2);
        }
        char[] result = new char[chars.length - begin];
        for (int i = begin, j = 0; i < chars.length; i++, j++) {
            result[j] = chars[i];
        }
        return new Exercise_28StringBuilder2(result);
    }
    public Exercise_28StringBuilder2 toUpperCase() {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i]) >= 97 && ((int) chars[i]) <= 122) {
                result[i] = (char) (65 + (((int) chars[i]) - 97));
            } else {
                result[i] = chars[i];
            }
        }
        return new Exercise_28StringBuilder2(result);
    }
    public int length() {
        return chars.length;
    }
    public char charAt(int index) {
        return chars[index];
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
