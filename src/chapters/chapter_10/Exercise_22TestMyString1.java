package chapters.chapter_10;

public class Exercise_22TestMyString1 {
    public static void main(String[] args) {
        char[] charArray = {'a' , 'b' , 'w' , 'A' , 'Z' , '!'} ;
        char[] ch = {'a' , 'b'};
        Exercise_22MyString1 s = new Exercise_22MyString1(charArray);
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.toString());
        System.out.println(s.equals(new Exercise_22MyString1(ch)));
        System.out.println(s.substring(0,4));
        System.out.println((s.toLowerCase()).toString());
    }
}
