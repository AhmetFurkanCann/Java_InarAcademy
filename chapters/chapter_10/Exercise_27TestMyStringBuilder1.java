package chapters.chapter_10;

public class Exercise_27TestMyStringBuilder1 {
    public static void main(String[] args) {
        Exercise_27MyStringBuilder1 s = new Exercise_27MyStringBuilder1("Inar Academy");
        System.out.println(s.append(new Exercise_27MyStringBuilder1(" Lesson")).toString());
        System.out.println(s.toString());
        System.out.println(s.append(100000));
        System.out.println(s.toString());
        System.out.println(s.charAt(5));
        System.out.println(s.toString());
        System.out.println(s.substring(3,8).toString());
        System.out.println(s.length());


    }
}
