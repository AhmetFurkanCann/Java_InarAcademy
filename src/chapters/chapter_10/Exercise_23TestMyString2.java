package chapters.chapter_10;

public class Exercise_23TestMyString2 {
    public static void main(String[] args) {
        Exercise_23MyString2 s = new Exercise_23MyString2("abwAZ!");
        System.out.println(s.compare("ab"));
        System.out.println(s.toString());
        System.out.println(s.substring(4));
        System.out.println((s.toUpperCase()).toString());
        System.out.println(Exercise_23MyString2.valueOf(false).toString());
    }
}
