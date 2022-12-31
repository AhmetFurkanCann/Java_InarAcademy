package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_22MyString1 {
    private char[] chars;
    public Exercise_22MyString1(char[] chars) {
        this.chars = chars ;
    }
    public char charAt(int index) {
        return chars[index] ;
    }
    public int length() {
        return chars.length ;
    }
    public Exercise_22MyString1 substring (int begin , int end) {
        if ((begin < 0) || (end > chars.length) || (end < begin) || (begin >= chars.length - 1) || (end <= 0) ){
            System.out.println("Invalid input");
            System.exit(-2);
        }
        char[] result = new char[end - begin];
        for (int i = begin , j = 0; i < end; i++ , j++) {
            result[j] = chars[i] ;
        }
        return new Exercise_22MyString1(result);
    }
    public Exercise_22MyString1 toLowerCase() {
        char[] result = new char[chars.length] ;
        for (int i = 0; i < chars.length; i++) {
            if (((int) chars[i]) >= 65 && ((int) chars[i]) <= 90){
                result[i] = (char) (97 + (((int) chars[i]) - 65)) ;
            }
            else {
                result[i] = chars[i];
            }
        }
        return new Exercise_22MyString1(result) ;
    }
    public boolean equals (Exercise_22MyString1 s) {
        if (length() != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)){
                return false;
            }
        }
        return true ;
    }
    public static Exercise_22MyString1 valueOf(int i) {
        int count = 0;
        int iCount = i ;
        while (count != 0) {
            iCount /= 10 ;
            count++;
        }
        char[] result = new char[count];
        for (int j = 0; j < count; j++) {
            result[j] = (char) ('0' + (i % 10) );
            i /= 10 ;
        }
        return new Exercise_22MyString1(result) ;
    }
    public String toString(){
        return Arrays.toString(chars);
    }
}
